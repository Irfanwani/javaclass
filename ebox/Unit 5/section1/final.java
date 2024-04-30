import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hall> halls = new ArrayList<>();
        ArrayList<Event> events = new ArrayList<>();
        ArrayList<HallBooking> bookings = new ArrayList<>();

        // Hardcoded values
        halls.add(new Hall("Sdf hall", "1234567890", 15000.0, "John Doe"));
        halls.add(new Hall("TUV hall", "0987654321", 20000.0, "Jane Smith"));

        events.add(new Event("Book Fair", "Annual book fair", "Library Association", "Fair"));
        events.add(new Event("Furniture Fair", "Exhibition of furniture", "Furniture Association", "Exhibition"));

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {
            System.out.println("Enter the booking details:");
            String input = scanner.nextLine();
            String[] details = input.split(",");
            String hallName = details[0].trim();
            String eventName = details[1].trim();
            String eventDateStr = details[2].trim();
            Double price = Double.parseDouble(details[3].trim());

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date eventDate = null;
            try {
                eventDate = dateFormat.parse(eventDateStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in dd-MM-yyyy format.");
                continue;
            }

            Hall hall = null;
            Event event = null;

            for (Hall h : halls) {
                if (h.getName().equals(hallName)) {
                    hall = h;
                    break;
                }
            }

            for (Event e : events) {
                if (e.getName().equals(eventName)) {
                    event = e;
                    break;
                }
            }


            try {
            if (hall == null || event == null) {
                throw new HallNotAvailableException("Hall or Event does not exist");
            }
            HallBooking booking = new HallBooking(hall, event, eventDate, price);

                if (HallBookingBO.validateHallBooking(bookings, booking)) {
                    bookings.add(booking);
                }
            } catch (HallNotAvailableException e) {
                System.out.println(e);
            }

            System.out.println("Do you want to continue?(y/n)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("The bookings entered are:");
        System.out.println("Hall id        Event id       Event date     Price");
        for (HallBooking booking : bookings) {
            System.out.println(booking);
        }
    }
}




class Event {
    private String name;
    private String detail;
    private String ownerName;
    private String type;

    public Event(String name, String detail, String ownerName, String type) {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.type = type;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Event id: %-15s Detail: %-15s Owner: %-15s Type: %-15s",
                name, detail, ownerName, type);
    }
}



class HallNotAvailableException extends Exception {
    public HallNotAvailableException(String message) {
        super(message);
    }
}


import java.util.Date;
import java.text.SimpleDateFormat;

class HallBooking {
    private Hall hall;
    private Event event;
    private Date eventDate;
    private Double price;

    public HallBooking(Hall hall, Event event, Date eventDate, Double price) {
        this.hall = hall;
        this.event = event;
        this.eventDate = eventDate;
        this.price = price;
    }

    // Getters and setters
    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("%-15s%-15s%-15s%-15s", hall.getName(), event.getName(), dateFormat.format(eventDate), price);
    }
}

import java.util.ArrayList;

class HallBookingBO {
    public static boolean validateHallBooking(ArrayList<HallBooking> bookingList, HallBooking booking) throws HallNotAvailableException {
        for (HallBooking existingBooking : bookingList) {
            if (existingBooking.getHall().getName().equals(booking.getHall().getName())
                    && existingBooking.getEventDate().equals(booking.getEventDate())) {
                throw new HallNotAvailableException("Hall Already Booked");
            }
        }
        return true;
    }
}



class Hall {
    private String name;
    private String contactNumber;
    private Double costPerDay;
    private String ownerName;

    public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return String.format("Hall id: %-15s Contact: %-15s Owner: %-15s Cost per day: %.2f",
                name, contactNumber, ownerName, costPerDay);
    }
}


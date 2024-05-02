import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		ArrayList<Event> eventList=new ArrayList<>();
		ArrayList<Hall> hallList=new ArrayList<>();
		
		eventList.add(new Event("Book Fair","All books available","John","Exhibition"));
		eventList.add(new Event("Furniture Fair","Discount of 20%","Joe","Exhibition"));
		eventList.add(new Event("Magic show","Magic without Logic","Jack","Stage event"));
		
		hallList.add(new Hall("Sdf hall","123456",new Double(10000.0),"Jill"));
		hallList.add(new Hall("JKL hall","135790",new Double(25000.0),"James"));
		hallList.add(new Hall("TUV hall","246800",new Double(15000.0),"Jane"));
		
		//write your code here

		Scanner sc = new Scanner(System.in);

		ArrayList<HallBooking> hallbooking = new ArrayList<>();

		Hall hall = new Hall();
		Event event = new Event();
		
		char x = 'y';
		while(x == 'y') {
			System.out.println("Enter the booking details:");
			String details[] = sc.nextLine().split(",");
			try {
				Hall h = hall.hallpresent(hallList, details[0]);
				Event e = event.eventpresent(eventList, details[1]);
				
				HallBooking newbooking = new HallBooking(h, e, details[2], details[3]);
				HallBookingBO.validateHallBooking(hallbooking, newbooking);
				hallbooking.add(newbooking);
			}catch(HallNotAvailableException e) {
				System.out.println(e);
			}

			System.out.println("Do you want to continue?(y/n)");
			String c = sc.nextLine();
			x = c.charAt(0);

		}

		 System.out.println("The bookings entered are:");
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Hall id", "Event id", "Event date", "Price");
        for(HallBooking h : hallbooking) {
            System.out.printf(h.toString());
        }

	}
}

import java.util.ArrayList;

public class Event {
		private String name;
		private String detail;
		private String ownerName;
		private String type;

        public Event() {};

        public Event(String name, String detail, String ownerName, String type) {
            this.name = name;
            this.detail = detail;
            this.ownerName = ownerName;
            this.type = type;
        }

        public String getName() {
            return this.name;
        }

        public Event eventpresent(ArrayList<Event> events, String s) throws HallNotAvailableException {
            for(Event e : events) {
                if(e.getName().equals(s)) return e;
            }

           throw new HallNotAvailableException("Hall or Event does not exist");
        }
}

class HallNotAvailableException extends Exception {
    public HallNotAvailableException(String message) {
        super(message);
    }
}



import java.util.Date;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;
import java.text.ParseException;

public class HallBooking {
	private Hall hall;
    private Event event;
    private Date eventDate;
    private Double price;

    public HallBooking(Hall hall, Event event, String eventDate, String price) {
        this.hall = hall;
        this.event = event;
        try {

        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy"); 
        Date date = sf.parse(eventDate);
        this.eventDate = date;
        }catch(ParseException e) {};

        this.price = Double.parseDouble(price);
        
    }

    public Hall getHall() {
        return this.hall;
    }

    public Event getEvent() {
        return this.event;
    }

    public String getDate() {
          SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
          return sf.format(this.eventDate);
    }

    public String getPrice() {
        return Double.toString(this.price);
    }


    @Override
    public  String toString() {
       return String.format("%-15s%-15s%-15s%-15s", this.getHall().getName(), this.getEvent().getName(), this.getDate(), this.getPrice());
    }

}

import java.util.ArrayList;

class HallBookingBO {
    public static boolean validateHallBooking(ArrayList<HallBooking> bookingList, HallBooking booking) throws HallNotAvailableException {
        for (HallBooking existingBooking : bookingList) {
            if (existingBooking.getHall().getName().equals(booking.getHall().getName())
                    && existingBooking.getDate().equals(booking.getDate())) {
                throw new HallNotAvailableException("Hall Already Booked");
            }
        }
        return true;
    }
}

import java.util.ArrayList;

public class Hall {
		private String name; 	
		private String 	contactNumber;
		private Double	costPerDay;
		private String 	ownerName;

        public Hall() {};
        
        public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
            this.name = name;
            this.contactNumber = contactNumber;
            this.costPerDay = costPerDay;
            this.ownerName = ownerName;
        }

        public String getName() {
            return this.name;
        }
        public Hall hallpresent(ArrayList<Hall> halls, String s) throws HallNotAvailableException {
            for(Hall h : halls) {
                if(h.getName().equals(s)) return h;
            }
           throw new HallNotAvailableException("Hall or Event does not exist");
        }
}

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//Your cod here
		try {
			Scanner sc = new Scanner(System.in);
			String hallname = sc.nextLine();

			List<Event> events = HallBookingBO.getEventDetails();
			List<Hall> halls = HallBookingBO.getHallDetails();
			
			List<HallBooking> hallbookings = HallBookingBO.getBookingDetails(events, halls);
			
			HallBookingBO.writeHallBooking(hallname, hallbookings);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}



import java.util.List;

public class Event {
	//Your code here
	private String name;
	private String detail;
	private String type;
	private String owner;
	private List<Hall> hallList;

	public Event(String name, String detail, String type, String owner) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.owner = owner;
	}

		public String getName() {
		return this.name;
	}
}

import java.util.Date;

public class HallBooking {
	//Your code here
	private Hall hall;
	private Event event;
	private Date startDate;
	private Date endDate;
	private Double price;

	public HallBooking(Hall hall, Event event, Date startDate, Date endDate, Double price) {
		this.hall = hall;
		this.event = event;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
	}

	public String getHallName() {
		return this.hall.getName();
	}

	public String getEventName() {
		return this.event.getName();
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public Double getPrice() {
		return this.price;
	}
}

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.text.*;
import java.util.Date;

public class HallBookingBO {
	
	public static List<Event> getEventDetails() throws IOException {
		BufferedReader buff = new BufferedReader(new FileReader(new File("event.csv")));
		//Your code here
		String line;
		List<Event> events = new ArrayList<>();

		while((line = buff.readLine()) != null) {
			String[] d = line.split(",");
			events.add(new Event(d[0], d[1], d[2], d[3]));
		}

		buff.close();
		return events;
	}
	
	public static List<Hall> getHallDetails() throws NumberFormatException, IOException {
		BufferedReader buff = new BufferedReader(new FileReader(new File("hall.csv")));
		//Your code here
		String line;
		List<Hall> halls = new ArrayList<>();

		while((line = buff.readLine()) != null) {
			String[] d = line.split(",");
			halls.add(new Hall(d[0], d[1], Double.parseDouble(d[2]), d[3]));
		}

		buff.close();
		return halls;
	}
	
	public static List<HallBooking> getBookingDetails(List<Event> events, List<Hall> halls) throws IOException, ParseException {
		BufferedReader buff = new BufferedReader(new FileReader(new File("booking.csv")));
		//Your code here
		String line;
		List<HallBooking> hallbookings = new ArrayList<>();
		while((line = buff.readLine()) != null) {
			String[] d = line.split(",");
			Hall hall = null;
			Event event = null;
			for(Hall h : halls) {
				if(h.getName().equals(d[0])) {
					hall = h;
					break;
				}
			}
			for(Event e : events) {
				if(e.getName().equals(d[1])) {
					event = e;
					break;
				}
			}

			SimpleDateFormat sf = new SimpleDateFormat("dd-mm-yyyy");
			Date sd = sf.parse(d[2]);
			Date ed = sf.parse(d[3]);
			Double price = Double.parseDouble(d[4]);

			hallbookings.add(new HallBooking(hall, event, sd, ed, price));
		}

		buff.close();
		return hallbookings;
	}
	
	public static void writeHallBooking(String hallName, List<HallBooking> bookings) throws IOException, ParseException {
		FileWriter fi = new FileWriter("result.csv",false);
		//Your code here
		for(HallBooking hb : bookings) {
			if(hb.getHallName().equals(hallName)) {
				SimpleDateFormat sf = new SimpleDateFormat("dd-mm-yyyy");
				String sd = sf.format(hb.getStartDate());
				String ed = sf.format(hb.getEndDate());
				
				String content = String.format("%s,%s,%s,%.1f\n", hb.getEventName(), sd, ed, hb.getPrice());
				fi.write(content);
			}
		}
		fi.close();
	}
	
}


import java.util.List;

public class Hall {
	//Yourd code here
	private String name;
	private String contact;
	private Double costPerDay;
	private String owner;
	private List<Event> eventList;

	public Hall(String name, String contact, Double costPerDay, String owner) {
		this.name = name;
		this.contact = contact;
		this.costPerDay = costPerDay;
		this.owner = owner;
	}

	public String getName() {
		return this.name;
	}
}

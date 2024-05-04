import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

		public static void main(String[] args){
			//Your code here
			try {
				BufferedReader br = new BufferedReader(new FileReader("input.txt"));

				HallBookingBO bo = new HallBookingBO();

				List<HallBooking> hallbookings = bo.readFile(br, Hall.prefill(), Event.prefill());
				
				Map<String , Integer> details = bo.showDetails(hallbookings);

				System.out.printf("%-10s %s\n", "Hall name", "No of events");
				for(String key : details.keySet()) {
					System.out.printf("%-10s %s\n", key, details.get(key));
				}

			}catch(IOException e) {
				e.printStackTrace();
			}
		}
}


import java.util.List;
import java.util.ArrayList;

public class Event {
	//Your code here
	private String name;
	private String detail;
	private String type;
	private String organiserName;

	public static List<Event> prefill(){
		List<Event> eventList=new ArrayList<>();
		eventList.add(new Event("Book Sale","Special sale","Academics","Ahamed"));
		eventList.add(new Event("PCB workshop","open for all","Academics","Antony"));
		eventList.add(new Event("Lathe workshop","only academicians","Academics","Vishnu"));
		eventList.add(new Event("Magic show","Comedy magic","Entertainment","Rathnam"));
		return eventList;
	}
	
	public Event(String name, String detail, String type, String organiserName) {
		this.name = name;
		this.detail = detail;
		this.type= type;
		this.organiserName = organiserName;
	}

	public String getName() {
		return this.name;
	}
}


import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class HallBooking {
	//Your code here
	private Hall hall;
	private Event event;
	private Date startDate;
	private Date endDate;
	private Double price;

	public HallBooking(Hall hall, Event event, String startDate, String endDate,String price)  {
		this.hall = hall;
		this.event = event;
		try {

		SimpleDateFormat sf = new SimpleDateFormat("dd-mm-yyyy");
		this.startDate = sf.parse(startDate);
		this.endDate = sf.parse(endDate);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		this.price = Double.parseDouble(price);
	}

	public String getName() {
		return this.hall.getName();
	}
	
}


import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.IOException;


public class HallBookingBO {
	//Your code here

	public List<HallBooking> readFile(BufferedReader br,List<Hall> hallList,List<Event> eventList) {
		List<HallBooking> hallbooking = new ArrayList<>();
		String line;

		try {

		while((line = br.readLine()) != null) {
			String hallname = line.substring(0, 10).trim();
			String eventname = line.substring(10, 25).trim();
			String startdate = line.substring(25, 35).trim();
			String enddate = line.substring(35, 45).trim();
			String price = line.substring(45, 50).trim();

			Hall hall = null;
			Event event = null;
			for(Hall h : hallList) {
				if(h.getName().equals(hallname)) {
					hall = h;
					break;
				}
			}

			for(Event e : eventList) {
				if(e.getName().equals(eventname)) {
					event = e;
					break;
				}
			}
		

				hallbooking.add(new HallBooking(hall, event, startdate, enddate, price));
		} 

		}catch(IOException e) {
			e.printStackTrace();
		}

		return hallbooking;

	}

	public Map<String,Integer> showDetails(List<HallBooking> list) {
		Map<String, Integer> details = new TreeMap<>();

		for(HallBooking hb : list) {
			if(details.containsKey(hb.getName())) {
				details.put(hb.getName(), details.get(hb.getName()) + 1);
			}else {
				details.put(hb.getName(), 1);
			}
		}

		return details;
	}
}

import java.util.List;
import java.util.ArrayList;

public class Hall{
	public static List<Hall> prefill(){
		List<Hall> hallList=new ArrayList<>();
		hallList.add(new Hall("RR hall","9876543210",5000.0,"Mahesh"));
		hallList.add(new Hall("KK hall","9879879879",15000.0,"Ganesh"));
		hallList.add(new Hall("JJ hall","9876543210",10000.0,"Rajesh"));
		hallList.add(new Hall("ARM hall","9876543210",8000.0,"Ashwin"));
		return hallList;
	}
    	//Your code here
		private String name; 
		private String contactNumber;
		private Double costPerDay;
		private String ownerName;

		public Hall(String name, String contactNumber, Double costPerDay,String ownerName) {
			this.name = name;
			this.contactNumber = contactNumber;
			this.costPerDay = costPerDay;
			this.ownerName = ownerName;
		}

		public String getName() {
			return this.name;
		}
}

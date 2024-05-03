import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		//write your code here
		Scanner sc = new Scanner(System.in);

		try {
			BufferedReader bs = new BufferedReader(new FileReader("input.csv"));

			String name;
			char x = 'y';

			EventBO ebo = new EventBO();
			ArrayList<Event> events = ebo.readFile(bs);
			
			while(x == 'y') {
				System.out.println("Enter the name of the person whose events to be shown:");
				name = sc.nextLine();
				ArrayList<Event> selectedEvents = ebo.eventsByPerson(events, name);

				if(selectedEvents.isEmpty()) {
					System.out.println("The given person has no upcoming events");
				}else {

				System.out.printf("%-15s%-20s%-15s%-15s%-15s\n", "Name", "Detail", "Type", "Attendees Count", "Projected Expense");
				for(Event e : selectedEvents) {
					System.out.println(e.toString());
				}
				}


				System.out.println("Do you want to continue?(y/n)");
				x = sc.nextLine().charAt(0);


			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}



public class Event {
	//write your code here
	private String name;
	private String detail;
	private String type;
	private String organiser;
	private Integer attendeesCont;
	private Double projectedExpense;

	public Event(String name, String detail, String type, String organiser, String attendeesCont, String projectedExpense) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.organiser = organiser;
		this.attendeesCont = Integer.parseInt(attendeesCont);
		this.projectedExpense = Double.parseDouble(projectedExpense);
	}

	public String getOrganiser() {
		return this.organiser;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-20s%-15s%-15s%-15s", this.name, this.detail, this.type, this.attendeesCont, this.projectedExpense);
	}
}


import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;


public class EventBO {
	
	public static ArrayList<Event> readFile(BufferedReader br) throws Exception {
		//write your code here
		ArrayList<Event> events = new ArrayList<>();
		try {
			String line;
			while((line = br.readLine()) != null) {
				String a = line.substring(0, 19).trim();
				String b = line.substring(19, 39).trim();
				String c = line.substring(39, 51).trim();
				String d = line.substring(51, 61).trim();
				String e = line.substring(61, 67).trim();
				String f = line.substring(67, 74).trim();
				events.add(new Event(a, b, c, d, e, f));
			}
		}catch(IOException e) {}
		
		return events;
	}
	
	public static ArrayList<Event> eventsByPerson(ArrayList<Event> eventList,String organiser) {
		//write your code here
		ArrayList<Event> events = new ArrayList<>();

			for(Event e : eventList) {
				if(e.getOrganiser().equals(organiser)) {
					events.add(e);
				}
			}

			return events;
	}
}

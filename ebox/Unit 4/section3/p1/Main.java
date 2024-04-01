import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args){
		//fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Events");
		int n = sc.nextInt();
		sc.nextLine();

		List<Event> events = new ArrayList<Event>();

		System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) \nDate:dd/MM/yyyy");

		for(int i = 0; i < n;  i++) {
			String s[] = sc.nextLine().split(",");
			SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
			try {

			Date sd = fm.parse(s[1]);
			Date ed = fm.parse(s[2]);

			Event e = new Event(s[0], sd, ed);
			if(sd.compareTo(ed) == 0) {
				events.add(e);
			}
			}
			catch(ParseException e) {
				continue;
			} 
		}
		System.out.println("1-day Events:");
		if(events.size() == 0) {
			System.out.println("No Events");
			return;
		}

		for(Event e: events) {
			System.out.println(e.getName());
		}
	}

}

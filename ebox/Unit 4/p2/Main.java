import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of events");
        //Fill your code here
        int n = scanner.nextInt();
        scanner.nextLine();
        Event e = new Event();
        List<Event> eventlist = new ArrayList<Event>();
        System.out.println("Enter event details in CSV(Event Name,Organiser Name,Event Cost)");
        for(int i = 0; i < n; i++) {
            String s[] = scanner.nextLine().split(",");
            Event obj = new Event(s[0], s[1], Double.parseDouble(s[2]));
            eventlist.add(obj);
        }
        
        e.display(eventlist);
    }
}   
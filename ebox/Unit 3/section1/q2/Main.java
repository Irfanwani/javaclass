import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of events in CSV format");
        String[] typesList = scanner.nextLine().split(",");
        ArrayList<EventType> list = new ArrayList<>();
        for (int i = 0; i < typesList.length; i++) {
            ArrayList<Event> e2 = new ArrayList<>();
            list.add(new EventType(typesList[i], e2));
        }
        System.out.println("Enter the number of Events");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Event " + (i + 1) + " Details");
            String[] eventDetails = scanner.nextLine().split(",");
            for (EventType eventType : list) {
                if (eventType.getName().equals(eventDetails[2])) {
                    eventType.addEvent(new Event(eventDetails[0], eventDetails[1], eventDetails[2], eventDetails[3]));
                }
            }
        }
        EventTypeBO eventTypeBO = new EventTypeBO();
        eventTypeBO.display(list);
        scanner.close();
    }
}

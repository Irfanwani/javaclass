import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of events");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        sc.nextLine();

        Event e = new Event();
        List<Event> events = new ArrayList<Event>();

        System.out.println("Enter event details in CSV(Event Name,Event Type,Orgnaizer Name)");
        for(int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(",");
            events.add(new Event(s[0], s[1], s[2]));
        }

            System.out.println("Filter:\n1)Using Event name\n2)Using Event type\n3)Using Organizer name\nChoice:");
            int m = sc.nextInt();
            if(m <= 0 || m > 3) {
                System.out.println("Invalid Input");
                return;
            }

            sc.nextLine();

            System.out.println("Enter value:");
            String opt = sc.nextLine();

            e.filterEvents(events, opt, m).forEach(x -> {
                System.out.println(x.getEventName() + "|" + x.getType() + "|" + x.getOrganizerName());
            });
            
        
    }
}
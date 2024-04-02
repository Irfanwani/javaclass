import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Event {
    String eventName;
    Date date;
    int attendeesCount;

    public Event(String eventName, Date date, int attendeesCount) {
        this.eventName = eventName;
        this.date = date;
        this.attendeesCount = attendeesCount;
    }

    public Date getDate() {
        return date;
    }

    public int getAttendeesCount() {
        return attendeesCount;
    }
}

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of event details");
        int n = Integer.parseInt(scanner.nextLine());

        Event[] events = new Event[n];

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        for (int i = 0; i < n; i++) {
            String[] details = scanner.nextLine().split(",");
            String eventName = details[0];
            Date date = dateFormat.parse(details[1]);
            int attendeesCount = Integer.parseInt(details[2]);
            events[i] = new Event(eventName, date, attendeesCount);
        }

        System.out.println("Enter the Date");
        Date givenDate = dateFormat.parse(scanner.nextLine());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(givenDate);

        int weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);

        int attendeesCountForWeek = 0;

        for (Event event : events) {
            calendar.setTime(event.getDate());
            if (calendar.get(Calendar.WEEK_OF_YEAR) == weekNumber) {
                attendeesCountForWeek += event.getAttendeesCount();
            }
        }

        System.out.println("Week number: " + weekNumber);
        System.out.println("Attendees count for the week is " + attendeesCountForWeek);
    }
}

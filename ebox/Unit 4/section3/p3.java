// needs updation

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of dates");
        int n = scanner.nextInt();
        scanner.nextLine(); 


        System.out.println("Enter dates of the events:(dd/MM/yyyy)");
        Map<String, Integer> dayCount = new HashMap<>();
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < n; i++) {
            String date = scanner.nextLine();
            Calendar calendar = Calendar.getInstance();
            String[] parts = date.split("/");
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]) - 1; 
            int year = Integer.parseInt(parts[2]);
            calendar.set(year, month, day);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); 
            String dayName = daysOfWeek[dayOfWeek - 1];
            dayCount.put(dayName, dayCount.getOrDefault(dayName, 0) + 1);
        }


        int maxEvents = 0;
        String busiestDay = "";
        for (Map.Entry<String, Integer> entry : dayCount.entrySet()) {
            if (entry.getValue() > maxEvents || (entry.getValue() == maxEvents && entry.getKey().compareTo(busiestDay) < 0)) {
                busiestDay = entry.getKey();
                maxEvents = entry.getValue();
            }
        }


        System.out.println("More number of events takes place on " + busiestDay);
    }
}

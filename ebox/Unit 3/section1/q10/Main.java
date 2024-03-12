import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the event:");
        String name = scanner.nextLine();
        System.out.println("Enter the detail of the event:");
        String detail = scanner.nextLine();
        System.out.println("Enter the owner name of the event:");
        String ownerName = scanner.nextLine();
        System.out.println("Enter the type of the event:\n1.Exhibition\n2.StageEvent");
        int eventType = scanner.nextInt();
        if (eventType == 1) {
            System.out.println("Enter the number of stalls:");
            int noOfStalls = scanner.nextInt();
            Exhibition exhibition = new Exhibition(name, detail, ownerName, noOfStalls);
            System.out.println("The projected revenue of the event is " + exhibition.projectedRevenue());
        } else if (eventType == 2) {
            System.out.println("Enter the number of shows:");
            int noOfShows = scanner.nextInt();
            System.out.println("Enter the number of seats per show:");
            int noOfSeatsPerShow = scanner.nextInt();
            StageEvent stageEvent = new StageEvent(name, detail, ownerName, noOfShows, noOfSeatsPerShow);
            System.out.println("The projected revenue of the event is " + stageEvent.projectedRevenue());
        } else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
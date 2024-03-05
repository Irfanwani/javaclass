import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Event type");
        System.out.println("1.Exhibition");
        System.out.println("2.Stage Event");
        int choice = Integer.parseInt(sc.nextLine());

        if (choice == 1) {
            System.out.println("Enter the details in CSV format");
            String exhibiinfo[] = sc.nextLine().split(",");
            Exhibition eve = new Exhibition(exhibiinfo[0], exhibiinfo[1], exhibiinfo[2], exhibiinfo[3],
                    Integer.parseInt(exhibiinfo[4]));
            eve.display();

        } else if (choice == 2) {
            System.out.println("Enter the details in CSV format");
            String eventinfo[] = sc.nextLine().split(",");
            StageEvent ste = new StageEvent(eventinfo[0], eventinfo[1], eventinfo[2], eventinfo[3],
                    Integer.parseInt(eventinfo[4]));
            ste.display();
        } else {
            System.out.println("Invalid choice");
        }
    }
}
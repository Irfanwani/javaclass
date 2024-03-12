import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice");
        System.out.println("1. Exhibition");
        System.out.println("2. StageEvent");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (choice == 1) {
            System.out.println("Enter the details in CSV format");
            String input = scanner.nextLine();
            String[] parts = input.split(",");

            if (parts.length != 6) {
                System.out.println("Invalid choice");
                return;
            }

            Exhibition exhibition = new Exhibition(parts[0], parts[1], parts[2], parts[3],
                    Integer.parseInt(parts[4]), Double.parseDouble(parts[5]));

            System.out.println("Exhibition Details");
            System.out.println("Event Name: " + exhibition.getName());
            System.out.println("Detail: " + exhibition.getDetail());
            System.out.println("Type: " + exhibition.getType());
            System.out.println("Organiser Name: " + exhibition.getOrganiser());
            System.out.println("Total Cost: " + exhibition.calculateAmount());
        } else if (choice == 2) {
            System.out.println("Enter the details in CSV format");
            String input = scanner.nextLine();
            String[] parts = input.split(",");

            if (parts.length != 6) {
                System.out.println("Invalid choice");
                return;
            }

            StageEvent stageEvent = new StageEvent(parts[0], parts[1], parts[2], parts[3],
                    Integer.parseInt(parts[4]), Double.parseDouble(parts[5]));

            System.out.println("Stage Event Details");
            System.out.println("Event Name: " + stageEvent.getName());
            System.out.println("Detail: " + stageEvent.getDetail());
            System.out.println("Type: " + stageEvent.getType());
            System.out.println("Organiser Name: " + stageEvent.getOrganiser());
            System.out.println("Total Cost: " + stageEvent.calculateAmount());
        } else {
            System.out.println("Invalid choice");
        }
    }
}

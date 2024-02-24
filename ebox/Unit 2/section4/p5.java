import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Address 1:");
        String address1 = scanner.nextLine();

        System.out.println("Address 2:");
        String address2 = scanner.nextLine();

        // Trim leading/trailing whitespace and convert to uppercase for case-insensitive comparison
        address1 = address1.trim();
        address2 = address2.trim();

        if (address1.equals(address2)) {
            System.out.println("RED");
        } else {
            // Check for mismatch only in spaces
            String address1NoSpaces = address1.replaceAll("\\s", "");
            String address2NoSpaces = address2.replaceAll("\\s", "");
            if (address1NoSpaces.equals(address2NoSpaces)) {
                System.out.println("YELLOW");
            } else if (address1.equalsIgnoreCase(address2)) {
                System.out.println("BLUE");
            } else {
                System.out.println("GREEN");
            }
        }
    }
}

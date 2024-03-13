import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source city:");
        String sourceCity = scanner.nextLine();
        System.out.println("Enter the destination city:");
        String destinationCity = scanner.nextLine();
        System.out.println("Enter the flight");
        System.out.println("1.Air India");
        System.out.println("2.Indigo");
        int choice = scanner.nextInt();
	AirFare airFare;
        if (choice == 1) {
            airFare = new AirIndia();
        } else {
            airFare = new Indigo();
        }

        Double fare = airFare.showFare(sourceCity, destinationCity);
        System.out.println("The fare is " + fare);
    }
}
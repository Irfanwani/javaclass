import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the stall:");
        String name = scanner.nextLine();
        System.out.println("Enter the detail of the stall:");
        String detail = scanner.nextLine();
        System.out.println("Enter the owner name of the stall:");
        String ownerName = scanner.nextLine();
        System.out.println("Enter the type of the stall:");
        String stallType = scanner.nextLine();
        System.out.println("Enter the size of the stall in square feet:");
        int squareFeet = scanner.nextInt();
        System.out.println("Does the stall have TV?(y/n)");
        String hasTV = scanner.next();
        double cost;
        if (hasTV.equalsIgnoreCase("y")) {
            System.out.println("Enter the number of TV:");
            int numberOfTV = scanner.nextInt();
            Stall stall = new Stall();
            cost = stall.computeCost(stallType, squareFeet, numberOfTV);
        } else {
            Stall stall = new Stall();
            cost = stall.computeCost(stallType, squareFeet);
        }
        System.out.println("The cost of the stall is " + cost);
        scanner.close();
    }
}

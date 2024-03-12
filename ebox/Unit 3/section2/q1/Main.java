import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the list of shapes
        System.out.println("List of Shapes:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("Enter your choice:");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the Circle:");
                Float radius = scanner.nextFloat();
                Circle circle = new Circle(radius);
                System.out.printf("The perimeter is %.2f\n", circle.calculatePerimeter());
                break;
            case 2:
                System.out.println("Enter the length of the Rectangle:");
                Float length = scanner.nextFloat();
                System.out.println("Enter the breadth of the Rectangle:");
                Float breadth = scanner.nextFloat();
                Rectangle rectangle = new Rectangle(length, breadth);
                System.out.printf("The perimeter is %.2f\n", rectangle.calculatePerimeter());
                break;
            case 3:
                System.out.println("Enter the side of the Square:");
                Float side = scanner.nextFloat();
                Square square = new Square(side);
                System.out.printf("The perimeter is %.2f\n", square.calculatePerimeter());
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}

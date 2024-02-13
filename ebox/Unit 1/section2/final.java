import java.util.Scanner;
public class Main {

 public static void main(String[] args) {
     int num1, num2;

     // Input two numbers
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the two numbers");
     num1 = scanner.nextInt();
     num2 = scanner.nextInt();

     // Perform the swap using XOR
     num1 = num1 ^ num2;
     num2 = num1 ^ num2;
     num1 = num1 ^ num2;

     // Print the swapped numbers
     System.out.println("The two values after swapping are");
     System.out.println(num1);
     System.out.println( num2);
 }
}

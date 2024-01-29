// Get the largest digit from the number
import java.util.Scanner;

public class GreatestDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if(num > 999 || num < 0) {
                throw new ArithmeticException("Number should be in 0-999 range.");
                
            }
            int largest = 0;
            while(num > 0) {
                int digit = num % 10;
                if(digit > largest) {
                    largest = digit;
                }

                num /= 10;
            }

            System.out.println("Largest digit is: " + largest);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}

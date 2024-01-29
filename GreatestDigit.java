// Get the largest digit from the number
import java.util.Scanner;

public class GreatestDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
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

    }
}

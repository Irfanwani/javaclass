import java.util.InputMismatchException;
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter an integer input");
            int input = sc.nextInt();
            System.out.println("Entered value is "+input);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
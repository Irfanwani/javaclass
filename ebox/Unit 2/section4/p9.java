import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = scanner.nextLine();

        // Split the string using split(), handling multiple spaces and empty tokens
        String[] tokens = str.trim().split("\\s+");

        System.out.println("The words in the string are");
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}

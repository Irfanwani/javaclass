import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = scanner.nextLine();

        // Use regular expression to replace multiple spaces with single spaces
        String processedStr = str.replaceAll("\\s+", " ");

        System.out.println("The processed string is" + processedStr);
    }
}

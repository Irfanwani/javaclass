import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text from the document");
        String documentText = scanner.nextLine();

        System.out.println("Enter the string to be found in the data");
        String gibberishText = scanner.nextLine();

        // Trim leading and trailing whitespace from both strings
        documentText = documentText.trim();
        gibberishText = gibberishText.trim();

        // Check if the gibberish text is found in the document text
        boolean found = documentText.contains(gibberishText);

        if (found) {
            System.out.println("String is found in the document");
        } else {
            System.out.println("String is not found in the document");
        }
    }
}

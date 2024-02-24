import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the content of the document");
        String draft = scanner.nextLine();

        System.out.println("Enter the old name of the company");
        String oldName = scanner.nextLine();

        System.out.println("Enter the new name of the company");
        String newName = scanner.nextLine();

        // Replace all occurrences of the old name (case-insensitive)
        String modifiedDraft = draft.replace(oldName, newName);

        System.out.println("The content of the modified document is");
        System.out.println(modifiedDraft);
    }
}

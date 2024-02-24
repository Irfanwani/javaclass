import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Replace words with SMS lingo
        String output = input.replaceAll("why", "y")
                            .replaceAll("you", "u")
                            .replaceAll("yes", "s")
                            .replaceAll("today", "2day");

        System.out.println(output);
    }
}

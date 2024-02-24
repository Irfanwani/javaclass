import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = scanner.nextLine();

        System.out.println("Enter the start string");
        String startStr = scanner.nextLine();

        if (str.startsWith(startStr)) {
            System.out.println("\"" + str + "\" starts with \"" + startStr + "\"");
        } else {
            System.out.println("\"" + str + "\" does not start with \"" + startStr + "\"");
        }
    }
}

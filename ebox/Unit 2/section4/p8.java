import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = scanner.nextLine();

        System.out.println("Enter the end string");
        String endStr = scanner.nextLine();

        if (str.endsWith(endStr)) {
            System.out.println("\"" + str + "\" ends with \"" + endStr + "\"");
        } else {
            System.out.println("\"" + str + "\" does not end with \"" + endStr + "\"");
        }
    }
}

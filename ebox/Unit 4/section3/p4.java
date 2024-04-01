import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Dates");
        String inputDates = scanner.nextLine();

        String[] dates = inputDates.split(" ");

        StringBuilder sb = new StringBuilder();

        System.out.println("Formatted dates");
        for (String date : dates) {
            sb.append(date, 0, 2).append("/");
            sb.append(date, 2, 4).append("/");
            sb.append(date, 4, 8);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
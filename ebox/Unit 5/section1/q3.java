import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the stage event start date and end date");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH:MM:SS");

            try {
                String startDateStr = scanner.nextLine();
                dateFormat.parse(startDateStr);
                String endDateStr = scanner.nextLine();
                dateFormat.parse(endDateStr);
                System.out.println("Start date:" + formatDate(startDateStr));
                System.out.println("End date:" + formatDate(endDateStr));

            } catch (ParseException e) {
                System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
            }

        scanner.close();
    }

	 // Method to format date string with double digits for minutes and seconds
    private static String formatDate(String dateStr) {
        String[] parts = dateStr.split(":");
        if (parts.length > 1) {
            for (int i = 1; i < parts.length; i++) {
                parts[i] = String.format("%02d", Integer.parseInt(parts[i]));
            }
            return String.join(":", parts);
        } else {
            return dateStr;
        }
    }
}

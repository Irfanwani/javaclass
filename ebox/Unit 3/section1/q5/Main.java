import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1.Exhibition event");
        System.out.println("2.Stage event");

        int event_type = s.nextInt();
        s.nextLine();
        Exhibition EE = new Exhibition();
        StageEvent SE = new StageEvent();

        if (event_type == 1) {
            System.out.println("Enter the details of exhibition:");
            String[] value = s.nextLine().split(",");
            EE.set(value[0], value[1], value[2], value[3], Double.parseDouble(value[4]), Integer.parseInt(value[5]));
        }
        if (event_type == 2) {
            System.out.println("Enter the details of stage event:");
            String[] value = s.nextLine().split(",");
            SE.set(value[0], value[1], value[2], value[3], Double.parseDouble(value[4]), Integer.parseInt(value[5]));
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Enter the starting date of the event:");
        Date startDate = dateFormat.parse(s.nextLine());

        System.out.println("Enter the ending date of the event:");
        Date endDate = dateFormat.parse(s.nextLine());

        long differenceInMilliseconds = endDate.getTime() - startDate.getTime();
        int differenceInDays = (int) TimeUnit.DAYS.convert(differenceInMilliseconds, TimeUnit.MILLISECONDS);
        double gst = 0;
        if (event_type == 1) {
            gst = EE.calculateGST(differenceInDays);
        } else if (event_type == 2) {
            gst = SE.calculateGST(differenceInDays);
        }

        System.out.println("The GST to be paid is Rs." + gst);

    }
}
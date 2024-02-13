import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of people");

        x = sc.nextInt();

        y = (2*x) / 7;
        System.out.println("Number of attendees on day 1 : " + y);
        System.out.println("Number of attendees on day 2 : " + y * 2);
        System.out.println("Number of attendees on day 3 : " + y/2);
     }
}
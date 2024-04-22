import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter the number of seats to be booked:");
        int n = sc.nextInt();

        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the seat number "+(i+1));
                int seatnum = sc.nextInt();
                if (seatnum < 1 || seatnum > 100) {
                    throw new ArrayIndexOutOfBoundsException("java.lang.ArrayIndexOutOfBoundsException: "+(seatnum-1));
                }
                arr[i] = seatnum;
            }
            System.out.println("The seats booked are:");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        if ((num & 1) == 1) {
            System.out.println(num + " is odd.");
        } else {
            System.out.println(num + " is even.");
        }
    }
}

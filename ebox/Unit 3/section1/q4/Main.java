import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Account Type");
        System.out.println("1.Savings Account");
        System.out.println("2.Current Account");

        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
            String accountInfo[] = sc.nextLine().split(",");
            
            SavingsAccount sa = new SavingsAccount(accountInfo[0], accountInfo[1], accountInfo[2], accountInfo[3]);
            sa.display();

        } else if (option == 2) {
            System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
            String currentInfo[] = sc.nextLine().split(",");

            CurrentAccount ca = new CurrentAccount(currentInfo[0], currentInfo[1], currentInfo[2], currentInfo[3]);
            ca.display();
        }
    }
}
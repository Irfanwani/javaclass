import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountBO accountBO = new AccountBO();

        System.out.println("Enter account Detail:");
        String detail = scanner.nextLine();

        FixedAccount fixedAccount = accountBO.getAccountDetail(detail);

        System.out.println("Account Details:");
        System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name", "Minimum balance", "Locking period");
        System.out.format("%-20s %-10s %-20s %-20s %s\n", fixedAccount.getAccountNumber(), fixedAccount.getBalance(), fixedAccount.getAccountHolderName(), fixedAccount.getMinimumBalance(), fixedAccount.getLockingPeriod());
    }
}
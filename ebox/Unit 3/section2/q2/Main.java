import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String accountNumber = sc.nextLine();
        System.out.println("Enter the balance of the account:");
        double balance = sc.nextDouble();
        System.out.println("Enter the type of transfer to be made:");
        System.out.println("1.NEFT\n2.IMPS\n3.RTGS");
        int ch = sc.nextInt();
        System.out.println("Enter the amount to be transferred:");
        double amount = sc.nextDouble();
        if (ch == 1) {
            NEFTTransfer nt = new NEFTTransfer(accountNumber, balance);
            if (nt.validate(amount)) {
                if (nt.transfer(amount)){
                    System.out.println("Transfer occurred successfully");
                    System.out.println("Remaining balance is " + nt.getBalance());
                }
                else{System.out.println("Transfer could not be made");}
            }else{System.out.println("Account number or transfer amount seems to be wrong");}
        }
         else if (ch == 2) {
            IMPSTransfer imt = new IMPSTransfer(accountNumber, balance);
            if (imt.validate(amount)) {
                if (imt.transfer(amount)){
                    System.out.println("Transfer occurred successfully");
                    System.out.println("Remaining balance is " + imt.getBalance());
                }else{System.out.println("Transfer could not be made");}
            }else{System.out.println("Account number or transfer amount seems to be wrong");}
        } 
        else if (ch == 3) {
            RTGSTransfer rt = new RTGSTransfer(accountNumber, balance);
            if (rt.validate(amount)) {
                if (rt.transfer(amount)){
                    System.out.println("Transfer occurred successfully");
                    System.out.println("Remaining balance is " + rt.getBalance());
                }else{System.out.println("Transfer could not be made");}
            }else{System.out.println("Account number or transfer amount seems to be wrong");}
        } 
        else {
            System.out.println("Invalid");
        }

    }
}
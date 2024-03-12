import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Booking details");
        String[] bookingDetails = scanner.nextLine().split(",");
        TicketBooking ticketBooking = new TicketBooking(bookingDetails[0], bookingDetails[1], Integer.parseInt(bookingDetails[2]));
        System.out.println("Payment mode\n1.Cash payment\n2.Wallet payment\n3.Credit card payment");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount");
                double cashAmount = scanner.nextDouble();
                ticketBooking.makePayment(cashAmount);
                break;
            case 2:
                System.out.println("Enter the amount");
                double walletAmount = scanner.nextDouble();
                System.out.println("Enter the wallet number");
                String walletNumber = scanner.next();
                ticketBooking.makePayment(walletNumber, walletAmount);
                break;
            case 3:
                System.out.println("Enter card holder name");
                String cardHolderName = scanner.next();
                System.out.println("Enter the amount");
                double cardAmount = scanner.nextDouble();
                System.out.println("Enter the credit card type");
                String creditCardType = scanner.next();
                System.out.println("Enter the CCV number");
                String ccvNumber = scanner.next();
                ticketBooking.makePayment(creditCardType, ccvNumber, cardHolderName, cardAmount);
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }
}

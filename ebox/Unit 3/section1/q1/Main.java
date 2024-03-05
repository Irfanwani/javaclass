import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the User detail");
        String[] userDetails = scanner.nextLine().split(",");

        System.out.println("Enter the contact details");
        String[] contactDetails = scanner.nextLine().split(",");

        ContactDetail contactDetail = new ContactDetail(contactDetails[0], contactDetails[1], contactDetails[2], contactDetails[3], contactDetails[4]);

        User user = new User(userDetails[0], contactDetail,userDetails[1], userDetails[2]);

        System.out.println(user);
    }
}

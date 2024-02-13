import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the event");
        String name = sc.nextLine();
        System.out.println("Enter the type of the event");
        String type = sc.nextLine();
        System.out.println("Enter the number of people expected");
        int num = sc.nextInt();
        System.out.println("Is it a paid entry? (Type Y or N)");
        char x = sc.next().charAt(0);
        System.out.println("Enter the projected expenses (in lakhs) for this event");
        double exp = sc.nextDouble();

        double rexp = Math.round(exp * 10.0) / 10.0;

        System.out.println("Event Name : " + name);
        System.out.println("Event Type : "+ type);
        System.out.println("Expected Count : " + num);
        System.out.println("Paid Entry : " + x);
        System.out.println("Projected Expense : " + rexp + "L");






        
     }
}
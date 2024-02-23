import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[]args) throws Exception
    { 
  // fill the code
	 
	 Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Customer Details");
      System.out.println("Enter the name");
        // fill the code
		String n = sc.nextLine();
      System.out.println("Enter the email");
       // fill the code
	   String e = sc.nextLine();
      System.out.println("Enter the type");
       // fill the code
	   String t = sc.nextLine();
      System.out.println("Enter the location");
        // fill the code
		String l = sc.nextLine();
		Customer obj = new Customer(n, e, t, l);
      System.out.println("\nCustomer Details");
      System.out.println("Name: "  + obj.getCustomerName());
      System.out.println("E-mail: "  + obj.getCustomerEmail());
      System.out.println("Type: "  + obj.getCustomerType());
      System.out.println("Location: "  + obj.getCustomerLocation());

    }
}
    

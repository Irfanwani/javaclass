import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		//fill the code here

		Scanner sc = new Scanner(System.in);
		Address ad = new Address();

		System.out.println("Enter Customer Address");
		System.out.println("Enter the street");
		ad.street = sc.nextLine();
		System.out.println("Enter the city");
		ad.city = sc.nextLine();
		System.out.println("Enter the pincode");
		ad.pincode = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the country");
		ad.country = sc.nextLine();

	ad.displayAddress();
	}

}

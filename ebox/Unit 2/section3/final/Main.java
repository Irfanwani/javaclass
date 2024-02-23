import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		//fill the code here
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the country name");
		String n = sc.nextLine();

		System.out.println("Enter the country code");
		String c = sc.nextLine();

		System.out.println("Enter the isd code");
		String isd = sc.nextLine();

		Country cn = new Country(n, c, isd);
		cn.display();

	}

}

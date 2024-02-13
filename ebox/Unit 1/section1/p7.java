import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number");
		String b = sc.nextLine();
		System.out.println("Enter the octal number");
		String o = sc.nextLine();
		System.out.println("Enter the hexadecimal number");
		String h = sc.nextLine();

		System.out.println("The integer value of the binary number " + b + " is " + Integer.parseInt(b, 2));
		System.out.println("The integer value of the octal number " + o + " is " + Integer.parseInt(o, 8));
		System.out.println("The integer value of the hexadecimal number " + h + " is " + Integer.parseInt(h, 16));

	}

}

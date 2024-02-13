import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		Integer num = sc.nextInt();
		System.out.println("The binary equivalent of " + num + " is " + Integer.toBinaryString(num));
		System.out.println("The hexadecimal equivalent of " + num + " is " + Integer.toHexString(num));
		System.out.println("The octal equivalent of " + num + " is " + Integer.toOctalString(num));
		System.out.println("Byte value of " + num + " is " + num.byteValue());
		System.out.println("Short value of " + num + " is " + num.shortValue());
		System.out.println("Long value of " + num + " is " + num.longValue());
		System.out.println("Float value of " + num + " is " + num.floatValue());
		System.out.println("Double value of " + num + " is " + num.doubleValue());

	}

}

import java.util.Scanner; 
import java.io.*;
class Test {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		Integer num = sc.nextInt();
		System.out.println("The binary equivalent of 540 is " + Integer.toBinaryString(num));
		System.out.println("The hexadecimal equivalent of 540 is " + Integer.toHexString(num));
		System.out.println("The octal equivalent of 540 is " + Integer.toOctalString(num));
		System.out.println("Byte value of 540 is " + num.byteValue());
		System.out.println("Short value of 540 is " + num.shortValue());
		System.out.println("Long value of 540 is " + num.longValue());
		System.out.println("Float value of 540 is " + num.floatValue());
		System.out.println("Double value of 540 is " + num.doubleValue());
}
}
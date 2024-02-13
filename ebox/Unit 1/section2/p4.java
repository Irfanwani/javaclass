import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Temparature in Celsius:");
		int temp = sc.nextInt();
		System.out.printf("Temparature in Fahrenheit is %.1fF",  (temp * 9.0f/5.0f) + 32);
	}

}

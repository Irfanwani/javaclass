import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc = new Scanner(System.in);

		char c = sc.next().charAt(0);

		if(c >= 'A' && c <= 'Z') {
			System.out.println(c + " is uppercase letter");
		}else if(c >= 'a' && c <= 'z') {
			System.out.println(c + " is lowercase letter");
		}else {
			System.out.println(c + " is neither an uppercase or lowercase letter");
		}
	}

}

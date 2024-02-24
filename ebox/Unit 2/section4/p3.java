import java.util.Scanner;

public class Main {
	public static void main(String []args){
		//fill your code here
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name:");
		String name = sc.nextLine();

		System.out.println("Name:"+name.toUpperCase());
	}
}

import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		//Your code here
		Set<String> usernames = new TreeSet<>();
		Scanner sc = new Scanner(System.in);

		char x;
		do {
			System.out.println("Enter the username");
			String user = sc.nextLine();
			usernames.add(user);
			System.out.println("Do you want to continue?(Y/N)");
			x = sc.nextLine().charAt(0);
		}while(x == 'Y');

		System.out.println("The unique number of usernames is " + usernames.size());
	}
}


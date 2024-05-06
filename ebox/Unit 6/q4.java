import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {
	public static void main(String args[]) throws Exception{
		//write your code here
		Scanner sc = new Scanner(System.in);
		List<String> halls = new ArrayList<>();

		System.out.println("Enter the number of halls:");
		int n = sc.nextInt();
		sc.nextLine();

		for(int i = 0; i < n; i++) {
			System.out.println("Enter the Hall Name " + (i + 1));
			halls.add(sc.nextLine());
		}

		System.out.println("Enter the hall name to be searched:");
		String hall = sc.nextLine();

		if(halls.contains(hall)) {
			System.out.println(hall + " hall is found in the list at position " + (halls.indexOf(hall)));
		}else {
			System.out.println(hall + " hall is not found");
		}
	}
}

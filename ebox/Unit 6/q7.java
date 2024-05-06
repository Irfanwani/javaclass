import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		//fill your code here
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new TreeMap<>();

		System.out.println("Enter the number of events:");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
		for(int i = 0; i < n ; i++) {
			String s[] = sc.nextLine().split(",");
			Integer price = Integer.parseInt(s[1]);
			Integer count = Integer.parseInt(s[2]);

			if(map.containsKey(price)) {
				map.put(price, map.get(price) + count);
			}else {
				map.put(price, count );
			}
		}

		System.out.printf("%-15s %s\n", "Ticket Price", "Tickets Booked");
		for(Integer i : map.keySet()) {
			System.out.printf("%-15d %d\n", i, map.get(i));
		}

	}
}

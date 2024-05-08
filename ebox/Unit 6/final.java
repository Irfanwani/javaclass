import java.util.*;

public class Main {
	public static void main(String args[]) {
		//write your code here
		Scanner sc = new Scanner(System.in);
		Map<String, Map<String, Integer>> citymap = new TreeMap<>();

		System.out.println("Enter the number of address:");
		int len = sc.nextInt();

		sc.nextLine();

		for(int i = 0; i < len; i++) {
			System.out.println("Enter the address:");
			String s[] = sc.nextLine().split(",");
			String city = s[1];
			String state  = s[2];

			if(citymap.containsKey(state)) {
				if(citymap.get(state).containsKey(city)) {
					citymap.get(state).put(city, citymap.get(state).get(city) + 1);
				}else {
					citymap.get(state).put(city, 1);
				}
			}else {
				Map<String, Integer> innermap = new TreeMap<>();
				innermap.put(city, 1);
				citymap.put(state, innermap);
			}
		}

		System.out.println("Number of entries in city/state wise:");
		for(String key : citymap.keySet()) {
			System.out.println("State:" + key);

		for(String ikey : citymap.get(key).keySet()) {
			System.out.println("City:" + ikey + " Count:" + citymap.get(key).get(ikey));
		}

	}
	}
}

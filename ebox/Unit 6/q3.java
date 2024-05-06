import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception{
		//write your code here
		Scanner sc = new Scanner(System.in);
		int n = 1;
		char x;
		List<ItemType> itemtypes = new ArrayList<>();

		do {
			System.out.println("Enter the details of Item Type " + (n));
			System.out.println("Name:");
			String name = sc.nextLine();

			System.out.println("Deposit:");
			Double deposit = sc.nextDouble();

			System.out.println("Cost per Day:");
			Double costPerDay = sc.nextDouble();
			itemtypes.add(new ItemType(name, deposit, costPerDay));

			sc.nextLine();
			System.out.println("Do you want to continue?(y/n)");
			x = sc.nextLine().charAt(0);
			n++;
		}while(x == 'y');

		System.out.printf("%-20s%-20s%-20s\n", "Name", "Deposit", "CostPerDay");
		for(ItemType i : itemtypes) {
			System.out.println(i.toString());
		}
	}
}


public class ItemType {
	//write your code here
	private String name;
	private Double deposit;
	private Double costPerDay;

	public ItemType(String name, Double deposit, Double costPerDay) {
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	@Override
	public String toString() {
		return String.format("%-20s%-20s%-20s", this.name, Double.toString(deposit), Double.toString(costPerDay));
	}
}
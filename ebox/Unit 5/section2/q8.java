import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		FileWriter fr = new FileWriter("output.txt");
		Scanner sc = new Scanner(System.in);

		//fill your code here
		ItemBO bo = new ItemBO();
		List<Item> items = new ArrayList<>();

		System.out.println("Enter number of items purchased");
		int n = sc.nextInt();

		if(n <= 0) {
			System.out.println("Invalid Input");
			return;
		}
		sc.nextLine();

		for(int i = 0; i < n; i++) {
			System.out.println("Enter item details in CSV(Item Number,Vendor Name,ItemType Name,Cost)");
			String[] s = sc.nextLine().split(",");
			Integer inum = Integer.parseInt(s[0]);

			String vendor = s[1];
			ItemType itemtype = new ItemType(s[2], Double.parseDouble(s[3]));

			items.add(new Item(inum, vendor, itemtype));
		}

		bo.writeFile(items, fr);
		
	}
}


public class Item {
	//fill your code here
	private Integer itemNumber;
	private String vendor;
	private ItemType itemType;

	public Item(Integer itemNumber, String vendor,ItemType itemType) {
		this.itemNumber = itemNumber;
		this.vendor = vendor;
		this.itemType = itemType;
	}

	public Integer getItemNumber() {
		return this.itemNumber;
	}

	public String getVendor() {
		return this.vendor;
	}

	public String getItemTypeName() {
		return this.itemType.getName();
	}

	public Double getItemCost() {
		return this.itemType.getCost();
	}
}


public class ItemType {
	//fill your code here
	private String itemTypeName;
	private Double cost;

	public ItemType(String itemTypeName, Double cost) {
		this.itemTypeName = itemTypeName;
		this.cost = cost;
	}

	public String getName() {
		return this.itemTypeName;
	}

	public Double getCost() {
		return this.cost;
	}
}



import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class ItemBO {
	//fill your code here
	public void writeFile(List<Item> itemList,FileWriter fr) throws IOException {
		DecimalFormat df = new DecimalFormat("#.0#");
		for(Item i : itemList) {
			String content = String.format("%d,%s,%s,%s\n", i.getItemNumber(), i.getVendor(), i.getItemTypeName(), df.format(i.getItemCost()));
			fr.write(content);
		}

		fr.flush();
	}
}

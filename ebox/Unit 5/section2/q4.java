import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]) {
		
		ArrayList<ItemType> itemTypeList=new ArrayList<>();
		itemTypeList.add(new ItemType("Electronics",new Double(1000),new Double(100)));
		itemTypeList.add(new ItemType("Furniture",new Double(1000),new Double(100)));
		itemTypeList.add(new ItemType("Decorations",new Double(1000),new Double(100)));
		
		//write your code here
		try {
			BufferedReader br  = new BufferedReader(new FileReader("input.csv"));

			ItemBO bo = new ItemBO();

			ArrayList<Item> items = bo.readFile(br, itemTypeList);

			TreeMap<String , Integer> itemtypes = ItemBO.listItem(items);

			System.out.println("The item types along with count of each:");

			for(String key: itemtypes.keySet()) {
				System.out.println(key + "--" + itemtypes.get(key));
			}
			

		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}


public class Item {
	//write your code here	
	private String number;
	private ItemType itemType;
	private String vendor;

	public Item(String number, ItemType itemType, String vendor) {
		this.number = number;
		this.itemType = itemType;
		this.vendor = vendor;
	}

	public String getName() {
		return this.itemType.getName();
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

	public String getName() {
		return this.name;
	}
}



import java.util.ArrayList;
import java.util.TreeMap;
import java.io.BufferedReader;

public class ItemBO {
	
	public static ArrayList<Item> readFile(BufferedReader br,ArrayList<ItemType> typeList) throws Exception {
		//write your code here
		ArrayList<Item> items = new ArrayList<>();
		String line;

		while((line = br.readLine()) != null) {
			String number = line.substring(0, 9).trim();
			String itemtype = line.substring(9, 23).trim();
			String vendor = line.substring(24).trim();

			for(ItemType i : typeList) {
				if(i.getName().equals(itemtype)) {
					items.add(new Item(number, i, vendor));
					break;
				}
			}
			
		}

		return items;

	}
	
	public static TreeMap<String, Integer> listItem(ArrayList<Item> itemList) {
		//write your code here
		TreeMap<String, Integer> itemtypes = new TreeMap<>();

		for(Item i : itemList) {
			if(itemtypes.containsKey(i.getName())) {
				itemtypes.put(i.getName(), itemtypes.get(i.getName()) + 1);
			}else {
				itemtypes.put(i.getName(), 1);
			}
		}

		return itemtypes;

	}
}

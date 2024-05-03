import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args){
		//Your code here
		try {
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));

			ItemTypeBO bo = new ItemTypeBO();

			List<ItemType> items = bo.readFromFile(br);
			List<ItemType> filteredItems =  bo.depositList(items);

			bo.display(filteredItems);
			

		}

		catch(IOException e) {
			e.printStackTrace();
		}
			
	}

}


public class ItemType {
    //Your code here
	private String name;
    private Double deposit;
    private Double costPerDay;

    public ItemType(String name, String deposit, String costPerDay) {
        this.name = name;
        this.deposit = Double.parseDouble(deposit);
        this.costPerDay = Double.parseDouble(costPerDay);
    }

    public String getName() {
        return this.name;
    }

    public Double getDeposit() {
        return this.deposit;
    }

    public Double getCostPerDay() {
        return this.costPerDay;
    }
}


import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;

public class ItemTypeBO {
	//Your code here
	public List<ItemType> readFromFile(BufferedReader br) {
		List<ItemType> items = new ArrayList<>();

		try {
			String line;

			while((line = br.readLine()) != null) {
				String name = line.substring(0, 15).trim();
				String deposit = line.substring(15, 22).trim();
				String costPerDay = line.substring(22, 27).trim();

				items.add(new ItemType(name,deposit, costPerDay));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return items;
	}

	public List<ItemType> depositList(List<ItemType> list) {
		List<ItemType> items = new ArrayList<>();

		for(ItemType i : list) {
			if(i.getDeposit() >  2000) {
				items.add(i);
			}
		}

		return items;
	}

	public void display(List<ItemType> list) {

		if(list.isEmpty()) {
			System.out.println("No item type has deposit more than 2000");
			return;
		}
		System.out.printf("%-15s %-15s %s\n", "Item type", "Deposit", "Cost per day");

		for(ItemType i : list) {
			System.out.printf("%-15s %-15.1f %.1f\n",  i.getName(), i.getDeposit(), i.getCostPerDay());
		}
	}
	}
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of item types:");
        int n = sc.nextInt();
        sc.nextLine();
        List<ItemType> items = new ArrayList<ItemType>();

        for(int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(",");
            items.add(new ItemType(s[0], Double.parseDouble(s[1]), Double.parseDouble(s[2])));
        }

        System.out.format("%-10s %-10s %s\n", "Name", "Cost", "Deposit");

        Collections.sort(items, Comparator.comparing(ItemType::getName));

        items.forEach(i -> {
            System.out.format("%-10s %-10s %s\n", i.getName(), i.getCostPerDay(), i.getDeposit());
        });
    }    
}
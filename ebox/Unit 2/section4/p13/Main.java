import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        Item[] items = new Item[n];

        System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
        for (int i = 0; i < n; i++) {
            String[] details = scanner.nextLine().split("\\$");
            items[i] = new Item(details[0], details[1], Integer.parseInt(details[2]), Integer.parseInt(details[3]));
        }

        System.out.println("Items:");
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            String availability = (item.getAvailableQuantity() > 0) ? "Available" : "Not Available";
            sb.append(item.getName()).append(",").append(item.getType()).append(",").append(item.getCost()).append(",").append(availability).append("\n");
        }
        System.out.println(sb.toString());
    }
}

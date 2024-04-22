import java.util.Scanner;

class ItemType {
    private String name;
    private Double deposit;
    private Double costPerDay;

    public ItemType() {
    }

    public ItemType(String name, Double deposit, Double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\n" +
                "Deposit:" + deposit + "\n" +
                "Cost Per Day:" + costPerDay;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Item type details:");
        System.out.println("Enter the name:");
        String name = scanner.nextLine();

        Double deposit = null;
        Double costPerDay = null;
                System.out.println("Enter the deposit:");
				String s = scanner.nextLine();
            try {
                deposit = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("java.lang.NumberFormatException: For input string: \"" + s + "\"");
				System.exit(0);
            }

                System.out.println("Enter the cost per day:");
				String c = scanner.nextLine();
            try {
                costPerDay = Double.parseDouble(c);
            } catch (NumberFormatException e) {
                System.out.println("java.lang.NumberFormatException: For input string: \"" + c + "\"");
				System.exit(0);
            }

        ItemType itemType = new ItemType(name, deposit, costPerDay);

        System.out.println("The details of the item type are:");
        System.out.println(itemType);
    }
}

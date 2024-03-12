import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Stall Type");
        System.out.println("1) Gold Stall");
        System.out.println("2) Premium Stall");
        System.out.println("3) Executive Stall");

        int choice = scanner.nextInt();

        Stall stall;
        switch (choice) {
            case 1:
                scanner.nextLine(); 
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
                String goldInput = scanner.nextLine();
                String[] goldParts = goldInput.split(",");
                stall = new GoldStall(goldParts[0], Integer.parseInt(goldParts[1]), goldParts[2], Integer.parseInt(goldParts[3]));
                break;
            case 2:
                scanner.nextLine(); 
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
                String premiumInput = scanner.nextLine();
                String[] premiumParts = premiumInput.split(",");
                stall = new PremiumStall(premiumParts[0], Integer.parseInt(premiumParts[1]), premiumParts[2], Integer.parseInt(premiumParts[3]));
                break;
            case 3:
                scanner.nextLine(); 
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
                String executiveInput = scanner.nextLine();
                String[] executiveParts = executiveInput.split(",");
                stall = new ExecutiveStall(executiveParts[0], Integer.parseInt(executiveParts[1]), executiveParts[2], Integer.parseInt(executiveParts[3]));
                break;
            default:
                System.out.println("Invalid Stall Type");
                return;
        }

        stall.display();
    }
}

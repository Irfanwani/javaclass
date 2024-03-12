import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Stall Type");
        System.out.println("1.Silver Stall");
        System.out.println("2.Gold Stall");
        System.out.println("3.Platinum Stall");

        int choice = scanner.nextInt();
        if(choice > 3) {
            return;
        }
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost");

        String[] stallDetails = scanner.nextLine().split(",");

        switch (choice) {
            case 1:
            System.out.println(")");
                SilverStall silverStall = new SilverStall(stallDetails[0], stallDetails[1], stallDetails[2], Integer.parseInt(stallDetails[3]));
                System.out.println("Stall Name: " + silverStall.getName());
                System.out.println("Details: " + silverStall.getDetail());
                System.out.println("Owner Name: " + silverStall.getOwner());
                System.out.println("Total Cost: " + silverStall.computeTotalCost());
                break;
            case 2:
                System.out.println(",Number of TV set)");
                int tvSet = Integer.parseInt(stallDetails[4]);
                GoldStall goldStall = new GoldStall(stallDetails[0], stallDetails[1], stallDetails[2], Integer.parseInt(stallDetails[3]), tvSet);
                System.out.println("Stall Name:" + goldStall.getName());
                System.out.println("Details:" + goldStall.getDetail());
                System.out.println("Owner Name:" + goldStall.getOwner());
                System.out.println("TV Sets:" + goldStall.getTvSet());
                System.out.println("Total Cost:" + goldStall.computeTotalCost());
                break;
            case 3:
                int tvSetPlatinum = Integer.parseInt(stallDetails[4]);
                System.out.println(",Number of TV set,Number of Projectors)");
                int projector = Integer.parseInt(stallDetails[5]);
                PlatinumStall platinumStall = new PlatinumStall(stallDetails[0], stallDetails[1], stallDetails[2], Integer.parseInt(stallDetails[3]), tvSetPlatinum, projector);
                System.out.println("Stall Name: " + platinumStall.getName());
                System.out.println("Details: " + platinumStall.getDetail());
                System.out.println("Owner Name: " + platinumStall.getOwner());
                System.out.println("TV Sets: " + platinumStall.getTvSet());
                System.out.println("Projectors: " + platinumStall.getProjector());
                System.out.println("Total Cost: " + platinumStall.computeTotalCost());
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

class PremiumStall implements Stall {
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer projector;

    public PremiumStall(String stallName, Integer cost, String ownerName, Integer projector) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
    }

    @Override
    public void display() {
        System.out.println("Stall Name: " + stallName);
        System.out.println("Cost: " + cost + ".Rs");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Number of Projectors: " + projector);
    }

    // Getters and setters
    // ...
}
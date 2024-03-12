class GoldStall implements Stall {
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer tvSet;

    public GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
    }

    @Override
    public void display() {
        System.out.println("Stall Name: " + stallName);
        System.out.println("Cost: " + cost + ".Rs");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Number of TV sets: " + tvSet);
    }

    // Getters and setters
    // ...
}
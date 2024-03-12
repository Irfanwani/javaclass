
class ExecutiveStall implements Stall {
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer screen;

    public ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.screen = screen;
    }

    @Override
    public void display() {
        System.out.println("Stall Name: " + stallName);
        System.out.println("Cost: " + cost + ".Rs");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Number of Screens: " + screen);
    }

    // Getters and setters
    // ...
}

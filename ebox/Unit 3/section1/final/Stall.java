
class Stall {
    protected String name;
    protected String detail;
    protected String ownerName;

    public Stall() {}

    public Stall(String name, String detail, String ownerName) {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Double computeCost(String stallType, Integer squareFeet) {
        if (stallType.equalsIgnoreCase("Platinum")) {
            return squareFeet * 200.0;
        } else if (stallType.equalsIgnoreCase("Diamond")) {
            return squareFeet * 150.0;
        } else if (stallType.equalsIgnoreCase("Gold")) {
            return squareFeet * 100.0;
        } else {
            return 0.0; // Invalid stall type
        }
    }

    public Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV) {
        double cost = computeCost(stallType, squareFeet);
        cost += numberOfTV * 10000.0; // Cost for each TV
        return cost;
    }
}
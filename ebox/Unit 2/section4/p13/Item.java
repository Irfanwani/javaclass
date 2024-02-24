class Item {
    private String name;
    private String type;
    private Integer cost;
    private Integer availableQuantity;

    public Item() {
    }

    public Item(String name, String type, Integer cost, Integer availableQuantity) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.availableQuantity = availableQuantity;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
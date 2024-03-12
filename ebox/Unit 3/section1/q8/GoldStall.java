class GoldStall extends SilverStall {
    private Integer tvSet;

    public GoldStall() {}

    public GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet) {
        super(name, detail, owner, cost);
        this.tvSet = tvSet;
    }

    // Getter and setter for TV set
    public Integer getTvSet() {
        return tvSet;
    }

    public void setTvSet(Integer tvSet) {
        this.tvSet = tvSet;
    }

    // Method to compute total cost
    @Override
    public Integer computeTotalCost() {
        return super.computeTotalCost() + (tvSet * 100);
    }
}
class PlatinumStall extends GoldStall {
    private Integer projector;

    public PlatinumStall() {}

    public PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector) {
        super(name, detail, owner, cost, tvSet);
        this.projector = projector;
    }

    // Getter and setter for projector
    public Integer getProjector() {
        return projector;
    }

    public void setProjector(Integer projector) {
        this.projector = projector;
    }

    // Method to compute total cost
    @Override
    public Integer computeTotalCost() {
        return super.computeTotalCost() + (projector * 500);
    }
}

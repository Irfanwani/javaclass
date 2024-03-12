class StageEvent extends Event {
    private Integer noOfShows;
    private Double costPerShow;

    public StageEvent(String name, String detail, String type, String organiser, Integer noOfShows, Double costPerShow) {
        super(name, detail, type, organiser);
        this.noOfShows = noOfShows;
        this.costPerShow = costPerShow;
    }

    @Override
    public Double calculateAmount() {
        return noOfShows * costPerShow;
    }

    // Getters and setters
    public Integer getNoOfShows() {
        return noOfShows;
    }

    public void setNoOfShows(Integer noOfShows) {
        this.noOfShows = noOfShows;
    }

    public Double getCostPerShow() {
        return costPerShow;
    }

    public void setCostPerShow(Double costPerShow) {
        this.costPerShow = costPerShow;
    }
}

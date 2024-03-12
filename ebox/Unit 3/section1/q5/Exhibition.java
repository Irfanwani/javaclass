class Exhibition extends Event {
    int no_of_stall;

    void set(String name, String detail, String type, String owner_name, double cost_per_day, int no_of_stall) {
        super.set(name, detail, type, owner_name, cost_per_day);
        this.no_of_stall = no_of_stall;
    }

    @Override
    double calculateGST(double total_no_of_days) {
        return super.calculateGST(total_no_of_days) * total_no_of_days * 0.05;
    }
}

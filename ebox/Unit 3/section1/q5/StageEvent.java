class StageEvent extends Event{
    int no_of_seats;
    void set(String name, String detail, String type, String owner_name, double cost_per_day, int no_of_seats) {
        super.set(name, detail, type, owner_name, cost_per_day);
        this.no_of_seats = no_of_seats;
    }

    @Override
    double calculateGST(double total_no_of_days) {
        return super.calculateGST(total_no_of_days)*total_no_of_days*0.15;
    }
}
public class StageEvent extends Event {
    private int noOfSeats;

    public StageEvent(String name, String detail, String type, String ownerName,int noOfSeats){
        super(name, detail, type, ownerName);
        this.noOfSeats = noOfSeats;
    }

    public void display(){
        super.display();
        System.out.println("Number of seats:"+noOfSeats);
    }
}

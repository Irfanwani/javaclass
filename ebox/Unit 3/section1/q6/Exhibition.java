public class Exhibition extends Event {
    private int noOfStall;

    public Exhibition(String name, String detail, String type, String ownerName,int noOfStall){
        super(name, detail, type, ownerName);
        this.noOfStall = noOfStall;
    }
    
    public void display(){
        super.display();
        System.out.println("Number of stalls:"+noOfStall);
    }
}

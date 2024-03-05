public class Event {
    private String name;
    private String detail;
    private String type;
    private String ownerName;

    public Event(String name, String detail, String type, String ownerName){
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.type = type;
    }
    public void display(){
        System.out.println("Event Name:"+name);
        System.out.println("Detail:"+detail);
        System.out.println("Type:"+type);
        System.out.println("Organiser Name:"+ownerName);
    }
}

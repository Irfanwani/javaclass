import java.util.ArrayList;
class EventType {
    private String name;
    private ArrayList<Event> list;

    public EventType(String name, ArrayList<Event> list) {
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Event> getList() {
        return list;
    }

    public void setList(ArrayList<Event> list) {
        this.list = list;
    }

    public void addEvent(Event event) {
        list.add(event);
    }

    public void display() {
        System.out.println("Event Type: " + name);
        System.out.printf("%-20s%-20s%-20s\n", "Name", "Detail", "Organiser Name");
        for (Event event : list) {
            System.out.printf("%-20s%-20s%-20s\n", event.getName(), event.getDetail(), event.getOrganiserName());
        }
    }
}
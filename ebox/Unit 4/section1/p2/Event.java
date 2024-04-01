import java.util.*;
class Event {
    private String eventName;
    private String organiserName;
    private Double eventCost;

    public Event() {
    }

    public Event(String eventName, String organiserName, Double eventCost) {
        this.eventName = eventName;
        this.organiserName = organiserName;
        this.eventCost = eventCost;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOrganiserName() {
        return organiserName;
    }

    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }

    public Double getEventCost() {
        return eventCost;
    }

    public void setEventCost(Double eventCost) {
        this.eventCost = eventCost;
    }

    public void display(List<Event> eventList) {
       //Fill your code here
       eventList.forEach(e -> {
           System.out.println(e.getEventName() + "|" + e.getOrganiserName() + "|" + e.getEventCost());
       });
    }
}
   
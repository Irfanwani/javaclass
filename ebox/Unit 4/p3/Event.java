import java.util.*;

class Event {
    private String eventName;
    private String eventType;
    private String organizer;

    public Event() {};

    public Event(String eventName, String eventType, String organizer) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.organizer = organizer;
    }

     public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOrganizerName() {
        return organizer;
    }

    public void setOrganizerName(String organizerName) {
        this.organizer = organizerName;
    }

    public String getType() {
        return eventType;
    }

    public void setType(String type) {
        this.eventType = type;
    }

    List<Event> filterEvents(List<Event> eventList,String name,int id)	{
        List<Event> ls = new ArrayList<Event>();
        eventList.forEach(e -> {
            
            String val = id == 1 ? e.getEventName() : id == 2 ? e.getType() : e.getOrganizerName();
            if(val.equals(name)) {
                ls.add(e);
            };
        });


        return ls;
    }
}   
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
		try {
		BufferedReader buff = new BufferedReader(new FileReader(new File("event.csv")));
		FileWriter fi = new FileWriter("eventtype.csv",false);
		//Your code here
		List<Event> items = new ArrayList<>();
		

			String line;
			while((line = buff.readLine()) != null) {
				String[] d = line.split(",");
				items.add(new Event(d[0], d[1], d[2], d[3]));
			}

			List<EventType> itemtypes = EventType.getEventType(items);

			String content = "";
			for(EventType i : itemtypes) {
				content += "," + i.getType();
			}
			
			fi.write(content.substring(1));
			fi.flush();
			fi.close();
            buff.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

public class Event {
	//Your code here
	private String name;
	private String detail;
	private EventType type;
	private String organizer;

	public Event(String name, String detail, String type, String organizer) {
		this.name = name;
		this.detail = detail;
		this.type = new EventType(type);
		this.organizer = organizer;
	}

	public EventType getEventType() {
		return type;
	}
}



import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class EventType implements Comparable<EventType>  {
	//Your code here
	private String type;
	public EventType(String type) {
		this.type = type;
	}
	public static List<EventType> getEventType(List<Event> events) {
		//Your code here
		Set<EventType> itemtypes = new TreeSet<>();

		for(Event e : events) {
			itemtypes.add(e.getEventType());
		}
		return new ArrayList<>(itemtypes);
	}

	public String getType() {
		return this.type;
	}

@Override
    public int compareTo(EventType other) {
        return this.type.compareTo(other.getType());
    }

}

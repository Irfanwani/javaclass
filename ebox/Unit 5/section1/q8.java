import java.util.ArrayList;
import java.util.Scanner;

public class Main {

		public static Boolean isValid(Long typeId,ArrayList<EventType> typeList)	 {
		for(EventType x : typeList) {
			if(x.getId().equals(typeId)) return true;
		}

		return false;
	}

	public static void main(String args[]) {
		
		ArrayList<EventType> typeList=new ArrayList<>();
		typeList.add(new EventType("Stage Event",new Long(1)));
		typeList.add(new EventType("Exhibition",new Long(2)));
		typeList.add(new EventType("Sports meet",new Long(3)));
		
		//write your code here
		ArrayList<Event> eventList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of the events:");
		int n = sc.nextInt();
		sc.nextLine();

		for(int i = 0; i < n; i++) {
			System.out.println("Enter the details of event " + (i+1));
			String inp[] = sc.nextLine().split(",");

			Long id = Long.parseLong(inp[3], 10);
			while(true) {
			try {
				if(!isValid(id, typeList)) {
					throw new EventTypeDoesNotExistsException("No event type available with the given id");
				}
				break;
				}catch(EventTypeDoesNotExistsException e) {
					System.out.println(e);
					System.out.println("Enter the correct event type id:");
					id = Long.valueOf(sc.nextInt());
				}
			}

			// sc.nextLine();
			eventList.add(new Event(inp[0], inp[1], inp[2], id));

		}

	System.out.println("The events entered are:\nName\tDetails\tOwner name\tEventtypeid");
	for(Event x : eventList) {
		System.out.println(x);
	}
		
	}
}



public class Event {
	private String name;
    private String detail;
    private String ownerName;
    private Long typeId;

    public Event(String name, String detail, String ownerName, Long typeId) {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return this.name + "\t" + this.detail + "\t" + this.ownerName + "\t" + this.typeId;
    }
}


public class EventTypeDoesNotExistsException extends Exception{
	public EventTypeDoesNotExistsException(String message) {
        super(message);
    }
}


public class EventType {
	private Long id;
    private String name;

    public EventType(String name, Long id) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }
}

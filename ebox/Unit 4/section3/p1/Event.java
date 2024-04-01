import java.util.*;

public class Event {
	//fill your code here
	private String eventName;
	private Date startDate;
	private Date endDate;
	public Event() {};
	public Event(String eventName, Date startDate, Date endDate) {
		this.eventName = eventName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	String getName() {
		return this.eventName;
	}

	Date getStartDate() {
		return this.startDate;
	}

	Date getEndDate() {
		return this.endDate;
	}

}

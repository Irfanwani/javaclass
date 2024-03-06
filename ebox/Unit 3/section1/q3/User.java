import java.util.*;

public class User {
	// fill your code here
	private String name;
	private String contactNumber;
	private List<Hall> hallList;

	public User() {};
	public User(String name, String contactNumber) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.hallList = new ArrayList<>();

	};

	public String getName() {
		return this.name;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public List<Hall> getHallList() {
		return this.hallList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setHallList(List<Hall> hallList) {
		this.hallList = hallList;
	}

	public void addToHallList(Hall hall) {
		if (this.hallList == null) {
        	this.hallList = new ArrayList<>();
    }
		this.hallList.add(hall);
	}

}

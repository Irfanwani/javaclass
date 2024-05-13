import java.util.*;

class Hall {
	//fill you code here
	private String name;
	private Integer costPerDay;
	private String ownerName;

	public Hall() {};
	
	public Hall(String name, Integer costPerDay, String ownerName) {
		this.name = name;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}

	public String getName() {
		return this.name;
	}

	public Integer getCostPerDay() {
		return this.costPerDay;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCostPerDay(Integer costPerDay) {
		this.costPerDay = costPerDay;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}


class User {
	// fill your code here
	private String name;
	private String contactNumber;
	private List<Hall> hallList;

	public User() {};
	public User(String name, String contactNumber) {
		this.name = name;
		this.contactNumber = contactNumber;
		hallList = new ArrayList<>();
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
		this.hallList.add(hall);
	}

}


public class Main {
	public static void main(String[] args){
		//fill your code here
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of users:");
		int numusers = sc.nextInt();
		sc.nextLine();
		List<User> users = new ArrayList<>();


		System.out.println("Enter the user details in comma separated(Name,Contact Number)");
		for(int i = 0; i < numusers; i++) {
			String ud[] = sc.nextLine().split(",");
			User u = new User(ud[0], ud[1]);

			users.add(u);
		}

		System.out.println("Enter the number of halls:");
		int numhalls = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the hall details in comma separated(Name,Cost per day,Owner Name)");
		for(int i = 0; i < numhalls; i++) {
			String hd[] = sc.nextLine().split(",");

 			for(User u : users) {
				if(u.getName().equals(hd[2])) {
					Hall newhall = new Hall(hd[0], Integer.parseInt(hd[1]), hd[2]);
					u.addToHallList(newhall);
				}
			}
		}
	System.out.println("Enter the username to be deleted:");
	String udel = sc.nextLine();

	for(User u: users) {
		if(u.getName().equals(udel)) {
			users.remove(u);
			break;
		}
	}

if(users.isEmpty()) {
	System.out.println("No users are there");
	return;
}

	for(User u: users) {
		System.out.println("Owner Name:" + u.getName());
		if(u.getHallList().isEmpty()) {
			System.out.println("No halls are available");
			continue;
		}
		int x = 1;
		for(Hall h: u.getHallList()) {
			System.out.println("Hall " + x);
			System.out.println("Name:" + h.getName());
			System.out.println("Cost per day:" + h.getCostPerDay());
			x++;
		}

	}

	}
}

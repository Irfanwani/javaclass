import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
		//Your code here
		Scanner sc = new Scanner(System.in);
		List<User> users = new ArrayList<>();

		System.out.println("Enter the number of User details to be added");
		int n = sc.nextInt();
		sc.nextLine();

		for(int i = 0; i < n; i++) {
			System.out.println("Enter the user " + (i+1) + " detail in csv format");
			String d[] = sc.nextLine().split(",");

			users.add(new User(d[0], d[1], d[2], d[3]));
		}

		UserBO ub = UserBO.getList();
		ub.addAll(users);
		
		UserBO.display(ub);
		System.out.println("Enter the range to be removed from array list");
		int x = sc.nextInt();
		int y = sc.nextInt();

		ub.removeUser(x, y);

		UserBO.display(ub);


	}
}



import java.util.ArrayList;

public class UserBO extends ArrayList<User>{
    public static UserBO getList(){
		UserBO u=new UserBO();
		u.add(new User("mohan Raja","9874563210","mohan","mohan@abc.in"));
		u.add(new User("arjun Ravi","4324237","arjun","arjun@abc.in"));
		u.add(new User("Arun kumar","9845671230","arun","arun@abc.in"));
		u.add(new User("prakash raj","7548921445","prakash","raj@abc.in"));
		return u;
	}
    //Your code here

	public void removeUser(int n1, int n2) {
		super.removeRange(n1, n2);

	}

	public static void display(UserBO list) {
		System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Username", "Email");
		for(User u : list) {
			u.display();
		}
	}
}




public class User{
    //Your code here
    private String name;
    private String contactNumber;
    private String userName;
    private String email;

    public User(String name, String contactNumber, String userName, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.userName = userName;
        this.email = email;
    }

    public void display() {
        System.out.printf("%-20s%-20s%-20s%-20s\n", this.name, this.contactNumber, this.userName, this.email);
    }
}
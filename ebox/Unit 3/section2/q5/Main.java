import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose the guide\r\n" + 
				"1)Make My Trip\r\n" + 
				"2)Trivago\r\n" + 
				"3)Clear Trip");
		Integer choice = Integer.parseInt(br.readLine());
		if(choice == 1) {
			MakeMyTrip makeMyTrip = new MakeMyTrip();
			makeMyTrip.displayCities();
			System.out.println("Enter city where you want to search for hotels:");
			String search = br.readLine();
			makeMyTrip.showTariff(search);
		}
		else if(choice == 2) {
			Trivago trivago = new Trivago();
			trivago.displayCities();
			System.out.println("Enter city where you want to search for hotels:");
			String search = br.readLine();
			trivago.showTariff(search);
		}
		else if(choice == 3) {
			ClearTrip clearTrip = new ClearTrip();
			clearTrip.displayCities();
			System.out.println("Enter city where you want to search for hotels:");
			String search = br.readLine();
			clearTrip.showTariff(search);
		}
		else {
			System.out.println("Invalid Choice");
		}
		br.close();

	}

}
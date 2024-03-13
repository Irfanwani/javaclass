
import java.util.*;

public class MakeMyTrip implements HotelTariff {
	public static Map<String, Map<String, Long>> getHotels(){
		Map<String, Map<String, Long>> hotelMap = new LinkedHashMap<>();
		Map<String, Long> hotelCosts1 = new LinkedHashMap<String, Long>();
    	hotelCosts1.put("Blue Stones", (long) 33000);
		hotelCosts1.put("Mahal", (long) 28000);
		hotelCosts1.put("Taj", (long) 20000);
        
		
		Map<String, Long> hotelCosts2 = new LinkedHashMap<String, Long>();
		hotelCosts2.put("Woods Park", (long) 27000);
		hotelCosts2.put("Union venue", (long) 16000);
		hotelCosts2.put("Celebrity", (long) 43000);
		
        Map<String, Long> hotelCosts3 = new LinkedHashMap<String, Long>();
    	hotelCosts3.put("Ecludia", (long) 80000);
		hotelCosts3.put("Angel Park", (long) 20000);
		hotelCosts3.put("Le Meridian", (long) 15000);

        hotelMap.put("Mumbai", hotelCosts1);
		hotelMap.put("Coimbatore", hotelCosts2);
		hotelMap.put("Hyderabad", hotelCosts3);
		return hotelMap;
	}
	public void displayCities() {
		Map<String, Map<String, Long>> hotelMap = MakeMyTrip.getHotels();
		System.out.println("Cities:");
		for(Map.Entry<String, Map<String, Long>> itr : hotelMap.entrySet()) {
			System.out.println(itr.getKey());
		}
	}
	public void showTariff(String city) {
		int flag = 0;
		Map<String, Map<String, Long>> hotelMap = MakeMyTrip.getHotels();
		for(Map.Entry<String, Map<String, Long>> itr : hotelMap.entrySet()) {
			if(city.contains(itr.getKey())) {
				flag += 1;
				Map<String, Long> hotelCosts = itr.getValue();
				for(Map.Entry<String, Long> i : hotelCosts.entrySet()) {
					System.out.println(i.getKey()+"-"+i.getValue());
				}
			}
		}
		if(flag == 0)
			System.out.println("No hotels are available for this city");
	}
}


import java.util.*;

public class Trivago implements HotelTariff {
	public static Map<String, Map<String, Long>> getHotels(){
		Map<String, Map<String, Long>> hotelMap = new LinkedHashMap<String, Map<String, Long>>();

		Map<String, Long> hotelCosts1 = new LinkedHashMap<String, Long>();
		hotelCosts1.put("Darby", (long) 30000);
		hotelCosts1.put("Nayara Springs", (long) 80000);
        hotelCosts1.put("La Fortuna", (long) 20000);

		Map<String, Long> hotelCosts2 = new LinkedHashMap<String, Long>();
		hotelCosts2.put("Kangaroo Island", (long) 200000);
		hotelCosts2.put("Rhode Island", (long) 145000);
		hotelCosts2.put("Ocean House", (long) 324000);

		Map<String, Long> hotelCosts3 = new LinkedHashMap<String, Long>();
		hotelCosts3.put("Londolozi Game Reserve", (long) 90000);
		hotelCosts3.put("Kruger National Park Area", (long) 232000);
		hotelCosts3.put("The Langham", (long) 100000);

		hotelMap.put("Costa Rica", hotelCosts1);
		hotelMap.put("Australia", hotelCosts2);
		hotelMap.put("Florida", hotelCosts3);

		return hotelMap;
	}
	public void displayCities() {
		Map<String, Map<String, Long>> hotelMap = Trivago.getHotels();
		System.out.println("Cities:");
		for(Map.Entry<String, Map<String, Long>> itr : hotelMap.entrySet()) {
			System.out.println(itr.getKey());
		}
	}
	public void showTariff(String city) {
		int flag = 0;
		Map<String, Map<String, Long>> hotelMap = Trivago.getHotels();
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
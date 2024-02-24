import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the code");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        HashMap<String, String> cityCodes = new HashMap();
        cityCodes.put("DH", "DEL");
        cityCodes.put("MB", "MUB");
        cityCodes.put("KL", "KOL");

        String citycode = cityCodes.get(s.substring(0, 2));
        sb.replace(0, 2, citycode);
        String p = String.format("%05d", Integer.parseInt(s.substring(2)));
        sb.replace(3, sb.length(), p);

        System.out.println("Formatted code\n" + sb);

    }
}
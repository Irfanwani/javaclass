import java.util.Scanner;
import java.io.FileWriter;

class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter("airport.csv");

            System.out.println("Enter the name of the ariport");
            String name = sc.nextLine();

            System.out.println("Enter the city name");
            String city = sc.nextLine();

            System.out.println("Enter the country code");
            String country = sc.nextLine();

            fw.write(String.format("%s,%s,%s", name, city, country));
            fw.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
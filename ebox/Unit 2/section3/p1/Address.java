public class Address{
    //fill the code here
    public String street;
    public String city;
    public int pincode;
    public String country;

    public void displayAddress() {
        System.out.println("Street: "+ street);
        System.out.println("City: "+ city);
        System.out.println("Pincode: "+ pincode);
        System.out.println("Country: "+ country);
    }
}
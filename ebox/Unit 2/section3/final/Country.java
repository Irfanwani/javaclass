public class Country{
    //fill the code here
    public String name;
    public String countryCode;
    public String isdCode;

    public Country(String n, String c, String isd) {
        name = n;
        countryCode = c;
        isdCode = isd;
    }

    public void display() {
        System.out.println("Country Name : " + name);
        System.out.println("Country Code : " + countryCode);
        System.out.println("ISD Code : " + isdCode);
    }
}
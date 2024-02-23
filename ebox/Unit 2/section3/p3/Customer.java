public class Customer {
    private String customerName;
    private String customerEmail;
    private  String customerType;
    private  String customerLocation;
    
   // fill the code

   public Customer(String cn, String ce, String ct, String cl) {
       customerName = cn;
       customerEmail = ce;
       customerType = ct;
       customerLocation = cl;
   };

    public void displayDetails() {
      System.out.println("Name: "  + customerName);
      System.out.println("E-mail: "  + customerEmail);
      System.out.println("Type: "  + customerType);
      System.out.println("Location: "  + customerLocation);

    }
   

}

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

   public String getCustomerName() {
       return customerName;
   };

   public String getCustomerEmail() {
       return customerEmail;
   };

   public String getCustomerType() {
       return customerType;
   };

   public String getCustomerLocation() {
       return customerLocation;
   };
   

}

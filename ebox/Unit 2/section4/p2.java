
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the input string");
            String s = sc.nextLine().trim();

            String res = "";
            boolean b = false;
            for(int i = 0; i < s.length(); i++) {
                if(b) res += Character.toUpperCase(s.charAt(i));
                else res += s.charAt(i);
                if(s.charAt(i) == ' ') b = true;
            }


        System.out.println("The processed string is \n"+res);
     }
}
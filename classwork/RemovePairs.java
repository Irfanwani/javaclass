// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class RemovePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        int i = 1;
        while(i < s.length()) {

            if(s.charAt(i) == s.charAt(i - 1)) {
                s = s.substring(0, i-1) + s.substring(i+1, s.length());
                i = 1;
                continue;
            }
            
            i++;
            
        }
        
        System.out.println(s);
    }
    
}
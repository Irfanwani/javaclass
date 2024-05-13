package ETP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Child c =  new Child();
        for(int i = 0; i < 10; i++) {
            c.setfromchild(sc.nextInt());
        }
        
        System.out.println("Elements from the array are : ");
        c.getfromchild();
    }
}
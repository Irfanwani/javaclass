import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        int x;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if(x % 4 == 0) {
            if(x % 100 != 0) {
                System.out.println(x + " is a leap year");
            }else {
                if(x % 400 == 0) {
                    System.out.println(x + " is a leap year");
                }else {
                    System.out.println(x + " is not a leap year");
                }
            }
        }else {
            System.out.println(x + " is not a leap year");
        }

    }
}
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        int x;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if(x % 3 == 0 && x % 7 == 0) {
            System.out.println(x + " is divisible by both 7 and 3");
        }else {
            System.out.println(x + " is not divisible by both 7 and 3");
        }
    }
}
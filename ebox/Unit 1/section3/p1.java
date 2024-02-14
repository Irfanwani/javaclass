import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        int x;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if(x % 2 == 0) {
            System.out.println(x + " is an even number");
        }else {
            System.out.println(x + " is an odd number");
        }
    }
}
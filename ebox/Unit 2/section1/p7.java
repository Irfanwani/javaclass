import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true) {
            int x = sc.nextInt();
            if(x == -999) break;
            sum += x;
        }

        System.out.println("The sum is " +sum);
    }
}
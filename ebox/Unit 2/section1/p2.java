import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact*= i;
        }

        System.out.println(fact);
    }
}
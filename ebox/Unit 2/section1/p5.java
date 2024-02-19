import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(int i = 1; i <= x; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
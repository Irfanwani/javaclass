import java.util.*;

class Main
{
    public static void main(String args[])
    {
         int x;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if(x % 2 == 0 || x % 3 == 0) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
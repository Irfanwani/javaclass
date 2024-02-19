import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int l = 1;
        while(l <= n) {
            int h = n;
            while(h >= l) {
                System.out.print((h) + " ");
                h--;
            }
            System.out.println();
            l++;
        }
    }
}
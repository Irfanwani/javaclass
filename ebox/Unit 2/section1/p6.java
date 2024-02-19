import java.util.*;

class Main
{

    static void printpattern(int n, int i , boolean isdivide) {
        String s = "S".repeat(isdivide ? i / 2 : 2*i);
        System.out.println("C".repeat(n/2 -i) + s + "C".repeat(n/2 -i));
    }
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("C".repeat(n));
        int i = 1;

        while(i < n -1) {

        if(2*i <= n) {
            if(n % (2*i) == 0) {
                printpattern(n, i, false);
            }else {
                printpattern(n, i+1, false);
                continue;
            };
        }else {
            if(n % (i/2) == 0) {
                printpattern(n, i, true);
            }else {
                printpattern(n, i-1, true);
                continue;
            }
        }

    i++;

        }
        System.out.println("K".repeat(n));

    }
}
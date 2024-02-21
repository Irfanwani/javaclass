import java.util.*;

class Main
{
    static String rep(char x, int num) {
        String res = "";
        for(int i = 0; i < num; i++) {
            res += x;
        }

        return res;
    }

    static void printpattern(int n, int i , boolean isdivide) {
        int nums = isdivide ? 2* (n - i - 1) : 2*i;
        String s = rep('S', nums);
        String cork = isdivide ? rep('K', (n - nums) / 2) : rep('C', n/2 -i);
        System.out.println(cork + s + cork);
    }

    static void check(int n, int i, boolean isdivide) {
        while((!isdivide && n % (2*i) != 0) || (isdivide && n % (2 * (n - i - 1)) != 0)) {
            if(isdivide) i--;
            else i++;
        }

        printpattern(n, i, isdivide);

    }
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(rep('C', n));
        int i = 1;

        while(i < n-1) {
        if(2*i <= n) {
            check(n, i, false);
        }else {
            check(n, i, true);
        }
    i++;
        }
        System.out.println(rep('K', n));

    }
}
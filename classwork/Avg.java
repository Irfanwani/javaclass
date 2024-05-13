import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double av = avg(num);

        int large = 0; 
        int small = 0; 
        int equal = 0; 
        
        while(num > 0) {
            int digit = num % 10;
            if(digit > av) {
                large++;
            }else if(digit < av) {
                small++;
            }else {
                equal++;
            }

            num /= 10;
        }

        System.out.println(large);
        System.out.println(small);
        System.out.println(equal);
    } 

    static double avg(int num) {
        double sum = 0;
        int n = num, l = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
            l++;
        }
        double res = sum / l;
        return res;
    }
}
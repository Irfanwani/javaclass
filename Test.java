import java.util.*;

class Main
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int b, t, f, l;
       System.out.println("Enter branding expenses");
       b = sc.nextInt();
       System.out.println("Enter travel expenses");
       t = sc.nextInt();
       System.out.println("Enter food expenses");
       f = sc.nextInt();
       System.out.println("Enter logistics expenses");
       l = sc.nextInt();

        float total = b+t+f+l, bper = (b * 100.0f) / total, tper = (t * 100.0f) / total, fper = (f * 100.0f) / total, lper = (l * 100.0f) / total;
        System.out.printf("Total expenses : Rs.%.2f\n" , total);
        System.out.printf("Branding expenses percentage : %.2f%%\n" , bper);
        System.out.printf("Travel expenses percentage : %.2f%%\n" , tper);
        System.out.printf("Food expenses percentage : %.2f%%\n" , fper);
        System.out.printf("Logistics expenses percentage :%.2f%%\n " , lper);
    }
}
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int x, y;
        System.out.println("Enter the cost of the item");
        x = sc.nextInt();
        System.out.println("Enter the number of items");
        y = sc.nextInt();
        System.out.println("Total cost is Rs."+x*y);
    }
}
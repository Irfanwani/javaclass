import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        int sum = 0;
        for(int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

    System.out.println("The sum of the elements in the array is " + sum);
    }
}
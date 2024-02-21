import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        int arr[] = new int[x];
        int arr2[] = new int[x];
        for(int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < x; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < x; i++) {
            if(arr[i] < arr2[i]) {
                System.out.println("Incompatible");
                return;
            }  
        }
                System.out.println("Compatible");


    }
}
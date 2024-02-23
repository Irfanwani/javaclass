import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");

        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the elements in the array");

        for(int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the location where you wish to delete an element");
        int y = sc.nextInt();

        if(y > x) {
            System.out.println("Invalid Input");
            return;
        }

        int cp[] = new int[x - 1];

        for(int i = 0, j = 0; i < x; i++, j++) {
            if(i == y-1) {
                if(i+1 >= x) break;
                cp[j] = arr[i+1];
                i++;
                continue;
            }

            cp[j] = arr[i];
            
        }

    System.out.println("Array after deletion is");
    for(int i = 0; i < x- 1; i++) {
        System.out.println(cp[i]);
    }
    }
}
import java.util.*;

class Main
{

    static void sortarr(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    } 

    static double median(int arr[]) {
        int len = arr.length;
        if(len % 2 != 0) {
            return arr[(len - 1) / 2] / 1.0d;
        }else {
            return (arr[(len) / 2] + arr[(len-1) / 2]) / 2.0d;
        }
    }
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

        sortarr(arr);
        
        System.out.printf("The median of the array is %.2f",  median(arr));
    }
}
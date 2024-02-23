import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i % 2 != 0) {
                    arr[j][i] = n * (i+1) - j;
                }else {
                    arr[j][i] = n * i + (j + 1); 
                }
            }
        }

 for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr[r-1][c-1]);
    }
}
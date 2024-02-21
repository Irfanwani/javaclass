import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//fill your code here
		int x;
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();

		int res = 0;

		int arr[] = new int[x];
		for(int i = 0;i < x; i ++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < x-1; i++) {
			for(int j = i + 1; j <x; j++ ) {
				if(arr[i] == arr[j]) {
					res++;
					break;
				}
			}
		}
		System.out.println(x - res);
	}
}

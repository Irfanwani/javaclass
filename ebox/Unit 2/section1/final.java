import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the Range :");
        a = sc.nextInt();
        b = sc.nextInt();

        for(int i = a; i <= b; i++) {
            if(i % 2 == 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
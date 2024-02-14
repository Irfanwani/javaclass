import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a + b + c > 180) {
            System.out.println("Not a Triangle");
            return;
        } 

        if(right(a, b, c)) {
            if(iso(a, b, c)) {
                System.out.println("Triangle is right isosceles");
            }else
            System.out.println("Triangle is right");
        }else if(eq(a, b, c)) {
            System.out.println("Triangle is equilateral");
        }else if(iso(a, b, c)) {
            System.out.println("Triangle is isosceles");
        }else {
            System.out.println("Triangle is not special");
        }

    }

    static boolean right(int a, int b, int c ) {
        if(a == 90 || b == 90 || c == 90) return true;
        return false;
    }

    static boolean eq(int a, int b, int c ) {
        if(a == 60 && b == 60 && c == 60) return true;
        return false;
    }

    static boolean iso(int a, int b, int c ) {
        if(a == b || b == c || c == a) return true;
        return false;
    }


}
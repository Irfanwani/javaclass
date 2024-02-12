import java.util.Scanner;
import java.lang.Math;

class Circle {
 public static float calArea(float rad) {
     float pi = 22.0f / 7;
        return pi * rad *  rad;
    }
}


class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        int r = sc.nextInt();

        float area = Math.round(Circle.calArea(r) * 100.0f) / 100.0f;

        System.out.println("The area of circle is " + area+".");
    }
}
import java.util.*;
import java.io.*;

public class Main 
{
    public static void main(String[] args)throws Exception
    {
         // fill the code
		System.out.println("Enter the shape\n1.Circle\n2.Rectangle\n3.Triangle");
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==1)
        {
            System.out.println("Enter the radius:");
               // fill the code
               double r = sc.nextDouble();
               Circle c = new Circle(r);
               c.computeArea();
               System.out.printf("Area of circle is %.2f\n", c.getArea());
        }
        else if(n==2)
        {
            System.out.println("Enter the length and breadth:");
               // fill the code
               double l = sc.nextDouble();
               double b = sc.nextDouble();
               Rectangle rec = new Rectangle(l, b);
               rec.computeArea();
               System.out.printf("Area of rectangle is %.2f\n", rec.getArea());
        }
        else if(n==3)
        {
            System.out.println("Enter the base and height:");
               // fill the code
               double b = sc.nextDouble();
               double h = sc.nextDouble();
               Triangle t = new Triangle(b, h);
               t.computeArea();
               System.out.printf("Area of triangle is %.2f\n", t.getArea());
        }
        else
        {
             System.out.format("Invalid choice");
        }
	}
}

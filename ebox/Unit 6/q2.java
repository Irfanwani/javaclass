import java.io.*;
import java.util.Scanner;

public class Main { 
	
	public static void main (String[] args) throws Exception{ 
		
		//Fill your code
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for length, width and depth : ");
		int l = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();

		Box<Integer, Integer, Integer> b = new Box<>(l, w, d);
		b.print();
	} 
}


public class Box<T1, T2, T3> {

	//Fill your code
	private T1 length;
	private T2 width;
	private T3 depth;

	public Box(T1 length, T2 width, T3 depth) {
		this.length = length;
		this.width = width;
		this.depth = depth;
	}

	public void print() {
		System.out.println("Length : " + this.length + "\n" + "Width : " + this.width + "\n" + "Depth : " + this.depth);
	}
}

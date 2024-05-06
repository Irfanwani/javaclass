import java.io.*;
import java.util.*;

public class Main {

	public static <E extends Comparable<E>> void printArray(E[] elements) {
        Arrays.sort(elements);
        System.out.println("Printing " + elements[0].getClass().getSimpleName() + " Array");
        for (E element : elements) {
            System.out.println(element);
        }
    }
	public static void main(String args[]) throws Exception {
		
		//Fill your code
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n");
		int n = sc.nextInt();
		
		Integer[] intArray = new Integer[n];
        Double[] doubleArray = new Double[n];

		System.out.println("Enter integers one by one");

		for(int i = 0; i < n; i++) {
			intArray[i] = sc.nextInt();
		}

		System.out.println("Enter double values one by one");

		for(int i = 0; i < n; i++) {
			 doubleArray[i] = sc.nextDouble();
		}

		printArray(intArray);
        printArray(doubleArray);



		
	}
}


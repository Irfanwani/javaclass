import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Queue<Integer> queue = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int choice;
        while(true) {

        System.out.println("Choice 1 : Insert\nChoice 2 : Delete\nChoice 3 : Search\nChoice 4 : Display\nAny other choice : Exit");
        choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter the element to be inserted");
                int num = sc.nextInt();
                queue.add(num);
                break;
            case 2:
                if(!queue.isEmpty()) {
                int del = queue.poll();
                System.out.println("The element " + (del) + " is deleted from queue ");
                }
                else {
                    System.out.println("Queue is empty");
                }
                break;
            case 3:
                System.out.println("Enter the value to be searched");
                int num2 = sc.nextInt();
                if(queue.contains(num2)) {
                    System.out.println("The element " + (num2) + " is present in the stack");
                }else {
                    System.out.println("The element " + (num2) + " is not present in the stack");
                }
                break;
            case 4:
            if(!queue.isEmpty()) {
                System.out.println("The elements in the queue are\n" + queue);
                
            }else {
                System.out.println("Queue is empty");
            }
                break;
            default:
                System.exit(0);
        }
        }
    }
}
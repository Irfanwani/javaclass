import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the string");
       String str = scanner.nextLine();

       System.out.println("Enter the string to be searched");
       String searchStr = scanner.nextLine();

       // First searchLast occurrence from starting index to end index
       int lastIndex = str.lastIndexOf(searchStr);
       System.out.println("The index of last occurence of \"" + searchStr + "\" is " + lastIndex);

       // Second searchLast occurrence from starting index to given index limit
       System.out.println("Enter the index limit");
       int indexLimit = scanner.nextInt();
       int lastIndexWithinLimit = str.lastIndexOf(searchStr, indexLimit);
       System.out.println("First occurence of \"" + searchStr + "\" from " + indexLimit + "th index backwards is " + lastIndexWithinLimit);
   }
}

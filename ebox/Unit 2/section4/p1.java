import java.util.Scanner;

public class Main {

  public static int findStringLength(char[] a) {
    int count = 0;
    while (count < a.length && a[count] != '\u0000') {
        count++;
    }
    return count;
}

    public static char[] findStringReverse(char[] a) {
        int n = findStringLength(a);
        char[] reversed = new char[n];
        for (int i = 0; i < n; i++) {
            reversed[n - 1 - i] = a[i];
        }
        return reversed;
    }

    public static char[] concatenateStrings(char[] a, char[] b) {
        int lenA = findStringLength(a);
        int lenB = findStringLength(b);
        char[] concatenated = new char[lenA + lenB];
        for (int i = 0; i < lenA; i++) {
            concatenated[i] = a[i];
        }
        for (int i = 0; i < lenB; i++) {
            concatenated[lenA + i] = b[i];
        }
        return concatenated;
    }

    public static int compareStrings(char[] a, char[] b) {
        int lenA = findStringLength(a);
        int lenB = findStringLength(b);
        int minLength = Math.min(lenA, lenB);
        for (int i = 0; i < minLength; i++) {
            if (a[i] < b[i]) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            }
        }
        if (lenA == lenB) {
            return 0;
        } else {
            return lenA < lenB ? -1 : 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] str1, str2;

        str1 = scanner.nextLine().toCharArray();

        str2 = scanner.nextLine().toCharArray();

        // Find and print string lengths
        System.out.println("Length of the first string is " + findStringLength(str1));
        System.out.println("Length of the second string is " + findStringLength(str2));

        // Reverse and print strings
        char[] reversedStr1 = findStringReverse(str1);
        char[] reversedStr2 = findStringReverse(str2);
        System.out.println("The reverse of the first string is " + new String(reversedStr1));
        System.out.println("The reverse of the second string is " + new String(reversedStr2));

        // Concatenate and print strings
        char[] concatenatedStr = concatenateStrings(str1, str2);
        System.out.println("The concatenated string is " + new String(concatenatedStr));

        // Compare and print strings
        int comparisonResult = compareStrings(str1, str2);
        if (comparisonResult == 0) {
            System.out.println("Both the input strings are same");
        } else if (comparisonResult < 0) {
            System.out.println(new String(str1) + " appears before " + new String(str2));
        } else {
            System.out.println(new String(str2) + " appears before " + new String(str1));
        }
    }
}

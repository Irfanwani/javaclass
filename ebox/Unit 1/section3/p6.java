import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int subject1 = scanner.nextInt();

    int subject2 = scanner.nextInt();

    int subject3 = scanner.nextInt();

    int totalMarks = subject1 + subject2 + subject3;
    double averageMark = totalMarks / 3.0;

    String grade;
    if (averageMark >= 90) {
      grade = "A";
    } else if (averageMark >= 80) {
      grade = "B";
    } else if (averageMark >= 70) {
      grade = "C";
    } else if (averageMark >= 60) {
      grade = "D";
    } else if (averageMark >= 50) {
      grade = "E";
    } else {
      grade = "F";
    }

    System.out.println("The grade is " + grade);
  }
}


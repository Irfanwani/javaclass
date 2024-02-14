import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Richter Magnitude: ");
    double magnitude = scanner.nextDouble();

    String intensity;
    if (magnitude <= 2.4) {
      intensity = "Micro";
    } else if (magnitude <= 5.4) {
      intensity = "Light";
    } else if (magnitude <= 6.0) {
      intensity = "Moderate";
    } else if (magnitude <= 6.9) {
      intensity = "Strong";
    } else if (magnitude <= 7.9) {
      intensity = "Major";
    } else {
      intensity = "Great";
    }

    System.out.println(intensity);
  }
}

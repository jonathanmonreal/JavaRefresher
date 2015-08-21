import java.util.Scanner;

public class Chapter3 {
  public static void problem1() {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter a, b, c: ");
    double a = in.nextDouble();
    double b = in.nextDouble();
    double c = in.nextDouble();
    double discriminant = Math.pow(b * b - 4 * a * c, 0.5);
    
    if (discriminant > 0) {
      System.out.println("The equation has two real roots " + (-b + discriminant) / (2 * a) + " and " +
                         (-b - discriminant) / (2 * a));
    } else if (discriminant == 0) {
      System.out.println("The equation has one root " + (-b / (2 * a)));
    } else {
      System.out.println("The equation has no real roots");
    }
  }
}
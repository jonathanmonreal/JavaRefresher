import java.util.Scanner;

public class Chapter2 {
  public static void problem1() {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a Celsius degree:");
    System.out.println((9.0 / 5) * in.nextDouble() + 32);
  }
}
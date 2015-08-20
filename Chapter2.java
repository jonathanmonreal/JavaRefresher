import java.util.Scanner;

public class Chapter2 {
  public static void problem1() {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter a Celsius degree:");
    System.out.println((9.0 / 5) * in.nextDouble() + 32);
  }
  
  public static void problem2() {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter a radius and length of a cylinder:");
    double radius = in.nextDouble();
    double length = in.nextDouble();
    double area = radius * radius * Math.PI;
    System.out.println("The area is " + area);
    System.out.println("The volume is " + area * length);
  }
}
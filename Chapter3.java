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
  
  public static void problem30() {
    Scanner in = new Scanner(System.in);
    long totalMilliseconds = System.currentTimeMillis();
    long totalSeconds = totalMilliseconds / 1000;
    long currentSecond = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    long currentMinute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    long currentHour = totalHours % 24;
    
    System.out.print("Enter the time zone offset to GMT: ");
    byte offset = in.nextByte();
    
    if (currentHour - offset < 0) {
      currentHour = 24 + offset + currentHour;
    } else {
      currentHour += offset;
    }
    
    if (currentHour < 12)
      System.out.printf("The current time is %d:%s:%s AM", currentHour, timeFormat(currentMinute), timeFormat(currentSecond));
    else
      System.out.printf("The current time is %d:%s:%s PM", currentHour - 12, timeFormat(currentMinute), timeFormat(currentSecond));
  }
  
  public static String timeFormat(long number) {
    if (number > 10)
      return Long.toString(number);
    else
      return "0" + Long.toString(number);
  }
}
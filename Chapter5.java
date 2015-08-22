import java.util.Scanner;

public class Chapter5 {
  public static void problem1() {
    Scanner in = new Scanner(System.in);
    int positives = 0;
    int negatives = 0;
    double total = 0.0;
    int input = 0;
    
    System.out.print("Enter an integer, the input ends if it is 0: ");
    do {
      input = in.nextInt();
      if (input > 0)
        positives++;
      if (input < 0)
        negatives++;
      total += input;
    } while (input != 0);
    
    if (positives == 0 && negatives == 0) {
      System.out.println("No numbers entered except 0");
      return;
    }
    
    System.out.printf("The number of positives is %d\n" +
                      "The number of negatives is %d\n" +
                      "The total is %f\n" +
                      "The average is %f\n",
                      positives, negatives, total, total / (positives + negatives));
  }
  
  public static void problem3() {
    System.out.println("Kilograms    Pounds");
    
    for (int kilograms = 1; kilograms < 200; kilograms += 2) {
      System.out.printf("%-3d           %5.1f\n", kilograms, kilograms * 2.2);
    }
  }
  
  public static void problem5() {
    System.out.println("Kilograms    Pounds    |    Pounds    Kilograms");
    int kilograms = 1, pounds = 20;
    while (kilograms < 200) {
      System.out.printf("%-3d           %5.1f    |", kilograms, kilograms * 2.2);
      System.out.printf("    %-3d           %5.2f\n", pounds, pounds / 2.2);
      kilograms += 2;
      pounds += 5;
    }
  }
  
  public static void problem10() {
    int total = 0;
    
    for (int number = 120; number < 991; number += 6) {
      if (number % 5 == 0 && number % 6 == 0) {
        System.out.print(number + " ");
        total++;
        
        if (total % 10 == 0)
          System.out.print("\n");
      }
    }
  }
  
  public static void problem12() {
    int n = 1;
    
    while (n * n < 12000)
      n++;
    
    System.out.println(n - 1);
  }
  
  public static void problem23() {
    double leftToRight = 0;
    double rightToLeft = 0;
    
    for (int i = 1; i <= 50000; i++)
      leftToRight += 1.0 / i;
    
    for (int i = 50000; i > 0; i--)
      rightToLeft += 1.0 / i;
    
    System.out.println("Left to right: " + leftToRight);
    System.out.println("Right to left: " + rightToLeft);
  }
}
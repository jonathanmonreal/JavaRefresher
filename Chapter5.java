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
}
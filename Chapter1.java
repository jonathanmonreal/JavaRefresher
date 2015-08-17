public class Chapter1 {
  public static void problem4() {
    System.out.println("a    a^2    a^3");
    
    for (int a = 0; a < 5; a++) {
      System.out.printf("%d    %-2d     %-2d\n", a, (int)Math.pow(a, 2), (int)Math.pow(a, 3));
    }
  }
}
public class Chapter1 {
  public static void problem4() {
    System.out.println("a    a^2    a^3");
    
    for (int a = 0; a < 5; a++) {
      System.out.printf("%d    %-2d     %-2d\n", a, (int)Math.pow(a, 2), (int)Math.pow(a, 3));
    }
  }
  
  public static void problem11() {
    int population = 312032386;
    for (int year = 0; year < 6; year++) {
      if (year > 0)
        System.out.printf("Year %d: %9d\n", year, population);
      population += (60.0 / 7) * 24 * 365 + (60.0 / 45) * 24 * 365 - (60.0 / 13) * 24 * 365;
    }
  }
}
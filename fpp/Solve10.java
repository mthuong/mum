package fpp;
/**
 * Solve10
 */
public class Solve10 {
  public static void main(String[] args) {
    int[] a = solve10();
    // a = solve10_();
    System.out.println(a[0] + " - " + a[1]);
  }

  public static int[] solve10() {
    int x = 0, y = 0, xFactorial, yFactorial;
    int factorial10 = factorial(10);
    int[] solve10 = new int[2];
    boolean foundFactorial = false;
    int sumFactorial = 0;
    for (x = 9; x >= 0; x--) {
      xFactorial = factorial(x);
      for (y = 9; y >= 0; y--) {
        yFactorial = factorial(y);
        sumFactorial = xFactorial + yFactorial;
        if (sumFactorial == factorial10) {
          foundFactorial = true;
          break;
        }
      }

      if (foundFactorial) {
        break;
      }
    }
    if (x == -1 && y == -1) {
      // Not Found
      x = 0;
      y = 0;
    }
    solve10[0] = x;
    solve10[0] = y;

    return solve10;
  }

  private static int factorial(int n) {
    if (n <= 1) {
      return 1;
    }
    int nFactorial = n * factorial(n - 1);
    return nFactorial;
  }

  static int[] solve10_() {
    int solve10[] = new int[2];
    int tenFactorial = 1;
    int x = 0;
    int y = 0;
    boolean factorialFound = false;
    for (int i = 1; i <= 10; i++) {
      tenFactorial = tenFactorial * i;
    }
    for (x = 0; x < 10; x++) {
      int xFactorial = 1;
      if (x > 0) {
        for (int i = 1; i <= x; i++) {
          xFactorial = xFactorial * i;
        }
      }
      for (y = 0; y < 10; y++) {
        int yFactorial = 1;
        if (y > 0) {
          for (int j = 1; j <= y; j++) {
            yFactorial = yFactorial * j;
          }
        }
        if (xFactorial + yFactorial == tenFactorial) {
          factorialFound = true;
          break;
        }
      }
      if (factorialFound) {
        break;
      }
    }
    if (x == 10 && y == 10) {
      // Not Found
      x = 0;
      y = 0;
    }
    solve10[0] = x;
    solve10[1] = y;
    return solve10;
  }
}
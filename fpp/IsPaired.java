package fpp;

public class IsPaired {
  public static void main(String[] args) {
    int[] a = new int[] { 0, 1 };
    System.out.println(isPaired(a));

    a = new int[] { 1, 4, 7 };
    System.out.println(isPaired(a));

    a = new int[] { 1, 4, 4 };
    System.out.println(isPaired(a));
  }

  static int isPaired(int[] a) {
    boolean shouldEven = false;
    if (a.length > 0) {
      if (a[0] % 2 == 0) {
        shouldEven = false;
      } else {
        shouldEven = true;
      }
    }

    for (int i = 1; i < a.length; i++) {
      int ai = a[i];
      if (ai % 2 == 0) {
        if (shouldEven == false) {
          return 0;
        }
        // Update next value should be odd number
        shouldEven = false;
      } else {
        if (shouldEven == true) {
          return 0;
        }
        // Update next value should be even number
        shouldEven = true;
      }
    }

    return 1;
  }
}

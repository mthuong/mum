package fpp;

public class Matches {
  public static void main(String[] args) {
    int[] a, p;

    a = new int[] { 1, 2, 3, -5, -5, 2, 3, 18 };
    p = new int[] { 3, -2, 3 };
    System.out.println(matches(a, p));

    p = new int[] { 2, 1, -1, -1, 2, 1 };
    System.out.println(matches(a, p));

    p = new int[] { 1, 2, -1, -1, 1, 2 };
    System.out.println(matches(a, p));

    p = new int[] { 2, 1, -2, 3 };
    System.out.println(matches(a, p));

    p = new int[] { 1, 1, 1, -1, -1, 1, 1, 1 };
    System.out.println(matches(a, p));

    p = new int[] { 4, -1, 3 };
    System.out.println(matches(a, p));

    p = new int[] { 2, -3, 3 };
    System.out.println(matches(a, p));

    p = new int[] { 8 };
    System.out.println(matches(a, p));
  }

  static int matches(int[] a, int[] p) {
    boolean isPositive = true;
    int lowerIndex = 0, upperIndex = 0;
    for (int i = 0; i < p.length; i++) {
      int pi = p[i];
      // Check positive or negative
      if (pi < 0) {
        isPositive = false;
      } else {
        isPositive = true;
      }

      // Setup the index for the next loop
      if (i == 0) {
        lowerIndex = 0;
        upperIndex = Math.abs(pi);
      } else {
        upperIndex += Math.abs(p[i]);
        lowerIndex += Math.abs(p[i - 1]);
      }

      // Check the sequence matches with the length in p array
      for (int j = lowerIndex; j < upperIndex; j++) {
        if (isPositive) {
          if (a[j] < 0) {
            return 0;
          }
        } else {
          if (a[j] > 0) {
            return 0;
          }
        }
      }

    }

    return 1;
  }
}

package fpp;

public class IsSequentiallyBounded {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 0, 1 };
    System.out.println(isSequentiallyBounded(a));

    a = new int[] { -1, 2 };
    System.out.println(isSequentiallyBounded(a));

    a = new int[] {};
    System.out.println(isSequentiallyBounded(a));

    a = new int[] { 5, 5, 5, 5 };
    System.out.println(isSequentiallyBounded(a));

    a = new int[] { 5, 5, 5, 2, 5 };
    System.out.println(isSequentiallyBounded(a));
  }

  static int isSequentiallyBounded(int[] a) {
    int isSequentiallyBounded = 1;
    // Check ascending order
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) {
        isSequentiallyBounded = 0;
        break;
      }

      // Check negative value return 0
      if (a[i] < 0 || a[i + 1] < 0) {
        isSequentiallyBounded = 0;
        break;
      }
    }
    if (isSequentiallyBounded == 0) {
      return isSequentiallyBounded;
    }

    // Check each value occurrences by maximum allowable
    for (int i = 0; i < a.length; i++) {
      int n = a[i];
      int count = 0;
      for (int j = 0; j < a.length; j++) {
        if (a[j] == n) {
          count++;
        }
      }
      if (count >= n) {
        isSequentiallyBounded = 0;
        break;
      }
    }

    return isSequentiallyBounded;
  }
}

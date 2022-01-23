package fpp;

public class IsOddHeavy {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 1 };
    System.out.println(isOddHeavy(a));

    a = new int[] { 2 };
    System.out.println(isOddHeavy(a));

    a = new int[] { 1, 1, 1, 1, 1, 1 };
    System.out.println(isOddHeavy(a));

    a = new int[] { 2, 4, 6, 8, 11 };
    System.out.println(isOddHeavy(a));

    a = new int[] { -2, -4, -6, -8, -11 };
    System.out.println(isOddHeavy(a));
  }

  static int isOddHeavy(int[] a) {
    int minOdd = Integer.MAX_VALUE, maxEven = Integer.MIN_VALUE;
    boolean isContainOddValue = false;
    for (int i = 0; i < a.length; i++) {
      int n = a[i];
      if (n % 2 == 0) {
        // even number
        if (maxEven < n) {
          maxEven = n;
        }
      } else {
        // odd number
        isContainOddValue = true;
        if (minOdd > n) {
          minOdd = n;
        }
      }
    }

    if (minOdd > maxEven && isContainOddValue == true) {
      return 1;
    } else {
      return 0;
    }
  }
}

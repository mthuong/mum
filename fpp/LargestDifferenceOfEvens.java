package fpp;

public class LargestDifferenceOfEvens {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 1, 3, 5, 9 };
    System.out.println(largestDifferenceOfEvens(a));

    a = new int[] { 1, 18, 5, 7, 33 };
    System.out.println(largestDifferenceOfEvens(a));

    a = new int[] { 2, 2, 2, 2 };
    System.out.println(largestDifferenceOfEvens(a));

    a = new int[] { 1, 2, 1, 2, 1, 4, 1, 6, 4 };
    System.out.println(largestDifferenceOfEvens(a));
  }

  static int largestDifferenceOfEvens(int[] a) {
    // count all evens numbers in a
    int countEvens = 0, maxEven = Integer.MIN_VALUE, minEven = Integer.MAX_VALUE;
    int largestDiff = -1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        countEvens++;

        if (minEven > a[i]) {
          minEven = a[i];
        }
        if (maxEven < a[i]) {
          maxEven = a[i];
        }
      }
    }
    if (countEvens < 2) {
      return -1;
    }

    largestDiff = maxEven - minEven;
    return largestDiff;
  }
}

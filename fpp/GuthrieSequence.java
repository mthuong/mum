package fpp;

public class GuthrieSequence {
  public static void main(String[] args) {
    int[] a = new int[] { 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1 };
    System.out.println(isGuthrieSequence(a));

    a = new int[] { 8, 4, 2, 1 };
    System.out.println(isGuthrieSequence(a));

    a = new int[] { 8, 17, 2, 1 };
    System.out.println(isGuthrieSequence(a));

    a = new int[] { 8, 4, 1 };
    System.out.println(isGuthrieSequence(a));

    a = new int[] { 8, 4, 2 };
    System.out.println(isGuthrieSequence(a));
  }

  public static int isGuthrieSequence(int[] a) {
    if (a[a.length - 1] != 1) {
      return 0;
    }
    int n = a[0];
    int expectedNextNumber;
    for (int i = 1; i < a.length; i++) {
      expectedNextNumber = nextGuthrieSequenceNumber(a[i - 1]);
      n = a[i];
      if (expectedNextNumber != n) {
        return 0;
      }
    }

    return 1;
  }

  public static int nextGuthrieSequenceNumber(int n) {
    if (n % 2 == 0) {
      // even
      return n / 2;
    } else {
      // odd
      return n * 3 + 1;
    }
  }
}

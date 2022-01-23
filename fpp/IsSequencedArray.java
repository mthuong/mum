package fpp;

public class IsSequencedArray {
  public static void main(String[] args) {
    int[] a;
    int m, n;

    a = new int[] { 1, 2, 3, 4, 5 };
    m = 1;
    n = 5;
    System.out.println(isSequencedArray(a, m, n));

    a = new int[] { 1, 3, 4, 2, 5 };
    m = 1;
    n = 5;
    System.out.println(isSequencedArray(a, m, n));

    a = new int[] { -5, -5, -4, -4, -4, -3, -3, -2, -2, -2 };
    m = -5;
    n = -2;
    System.out.println(isSequencedArray(a, m, n));

    a = new int[] { 0, 1, 2, 3, 4, 5 };
    m = 1;
    n = 5;
    System.out.println(isSequencedArray(a, m, n));

    a = new int[] { 1, 2, 3, 4, };
    m = 1;
    n = 5;
    System.out.println(isSequencedArray(a, m, n));

    a = new int[] { 1, 2, 5 };
    m = 1;
    n = 5;
    System.out.println(isSequencedArray(a, m, n));

    a = new int[] { 5, 4, 3, 2, 1 };
    m = 1;
    n = 5;
    System.out.println(isSequencedArray(a, m, n));
  }

  static int isSequencedArray(int[] a, int m, int n) {
    int currentSequenceNumber = m;
    int isSequencedArray = 1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == currentSequenceNumber) {
        continue;
      } else if (a[i] == currentSequenceNumber + 1) {
        currentSequenceNumber += 1;
        continue;
      } else {
        isSequencedArray = 0;
      }
    }
    if (currentSequenceNumber != n) {
      isSequencedArray = 0;
    }

    return isSequencedArray;
  }
}

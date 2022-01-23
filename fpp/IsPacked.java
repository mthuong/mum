package fpp;

public class IsPacked {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 2, 2, 1 };
    System.out.println(isPacked(a));

    a = new int[] { 2, 2, 1, 2, 2 };
    System.out.println(isPacked(a));

    a = new int[] { 4, 4, 4, 4, 1, 2, 2, 3, 3, 3 };
    System.out.println(isPacked(a));

    a = new int[] { 7, 7, 7, 7, 7, 7, 7, 1 };
    System.out.println(isPacked(a));

    a = new int[] { 7, 7, 7, 7, 1, 7, 7, 7 };
    System.out.println(isPacked(a));

    a = new int[] { 7, 7, 7, 7, 7, 7, 7 };
    System.out.println(isPacked(a));

    a = new int[] {};
    System.out.println(isPacked(a));

    a = new int[] { 1, 2, 1 };
    System.out.println(isPacked(a));

    a = new int[] { 2, 1, 1 };
    System.out.println(isPacked(a));

    a = new int[] { -3, -3, -3 };
    System.out.println(isPacked(a));

    a = new int[] { 0, 2, 2 };
    System.out.println(isPacked(a));

    a = new int[] { 2, 1, 2 };
    System.out.println(isPacked(a));
  }

  static int isPacked(int[] a) {
    if (a.length == 0) {
      return 1;
    }

    int isPacked = 1;
    int[] packed = new int[] {};

    int currentPackNumber = a[0];
    int countNumber = 0;
    for (int i = 0; i < a.length; i++) {
      int n = a[i];
      if (n < 0) {
        isPacked = 0;
        break;
      }
      if (packed.length == 0) {
        packed = append(packed, n);
        countNumber++;
      } else {
        if (n == currentPackNumber) {
          // current consecutive
          countNumber++;
        } else {
          // new consecutive

          // Validate n appears n times
          if (currentPackNumber != countNumber) {
            isPacked = 0;
            break;
          } else {
            // Validate all equal values are in consecutive locations, if new consecutive
            // numbers already in packed array, the input a array is not packed
            for (int j = 0; j < packed.length; j++) {
              int packedNumber = packed[j];
              // The number already appears in previous locations
              if (packedNumber == n) {
                isPacked = 0;
                break;
              }
            }
            if (isPacked == 0) {
              break;
            }

            // Start a new consecutive
            packed = append(packed, n);
            currentPackNumber = n;
            countNumber = 1;
          }
        }
      }
    }

    return isPacked;
  }

  static int[] append(int[] a, int n) {
    int[] result = new int[a.length + 1];
    for (int i = 0; i < a.length; i++) {
      result[i] = a[i];
    }
    result[a.length] = n;
    return result;
  }
}

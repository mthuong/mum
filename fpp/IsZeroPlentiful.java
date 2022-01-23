package fpp;

public class IsZeroPlentiful {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 0, 0, 0, 0, 0 };
    System.out.println(isZeroPlentiful(a));

    a = new int[] { 1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12 };
    System.out.println(isZeroPlentiful(a));

    a = new int[] { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0 };
    System.out.println(isZeroPlentiful(a));

    a = new int[] { 1, 2, 3, 4 };
    System.out.println(isZeroPlentiful(a));

    a = new int[] { 1, 0, 0, 0, 2, 0, 0, 0, 0 };
    System.out.println(isZeroPlentiful(a));

    a = new int[] { 0 };
    System.out.println(isZeroPlentiful(a));

    a = new int[] {};
    System.out.println(isZeroPlentiful(a));
  }

  static int isZeroPlentiful(int[] a) {
    int zeroSequences = 0;
    boolean isContainZero = false;
    for (int i = 0; i < a.length;) {
      if (a[i] == 0) {
        isContainZero = true;
        int count = 0;
        for (int j = i; j < a.length; j++) {
          if (a[j] == 0) {
            count++;
          } else {
            break;
          }
        }
        if (count >= 4) {
          zeroSequences++;
          i = i + count;
        } else {
          return 0;
        }
      } else {
        i++;
      }
    }

    if (isContainZero == false) {
      return 0;
    }
    return zeroSequences;
  }
}

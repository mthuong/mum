package fpp;

public class IsHollow {
  public static void main(String[] args) {
    int[] a = new int[] { 1, 2, 0, 0, 0, 3, 4 };
    System.out.println(isHollow(a));

    a = new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18 };
    System.out.println(isHollow(a));

    a = new int[] { 1, 2, 0, 0, 3, 4 };
    System.out.println(isHollow(a));

    a = new int[] { 1, 2, 0, 0, 0, 3, 4, 5 };
    System.out.println(isHollow(a));

    a = new int[] { 3, 8, 3, 0, 0, 0, 3, 3 };
    System.out.println(isHollow(a));

    a = new int[] { 1, 2, 0, 0, 0, 3, 4, 0 };
    System.out.println(isHollow(a));

    a = new int[] { 0, 1, 2, 0, 0, 0, 3, 4 };
    System.out.println(isHollow(a));

    a = new int[] { 0, 0, 0 };
    System.out.println(isHollow(a));
  }

  static int isHollow(int[] a) {
    int i = 0;
    // Count preceding non-zero numbers
    int preceding = 0;
    for (; i < a.length; i++) {
      int ai = a[i];
      if (ai != 0) {
        preceding++;
      } else {
        break;
      }
    }

    // Count numbers of zero in the middle
    int zeros = 0;
    for (; i < a.length; i++) {
      int ai = a[i];
      if (ai == 0) {
        zeros++;
      } else {
        break;
      }
    }

    // Count following non-zero numbers
    int following = 0;
    for (; i < a.length; i++) {
      int ai = a[i];
      if (ai != 0) {
        following++;
      } else {
        break;
      }
    }

    if (i != a.length) {
      return 0;
    }

    int sumLength = preceding + zeros + following;
    if (sumLength != a.length) {
      return 0;
    }

    if (preceding != following || zeros < 3) {
      return 0;
    }

    return 1;
  }
}

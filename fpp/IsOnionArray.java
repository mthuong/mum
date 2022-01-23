package fpp;

public class IsOnionArray {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 1, 2, 19, 4, 5 };
    System.out.println(isOnionArray(a));

    a = new int[] { 1, 2, 3, 4, 15 };
    System.out.println(isOnionArray(a));

    a = new int[] { 1, 3, 9, 8 };
    System.out.println(isOnionArray(a));

    a = new int[] { 2 };
    System.out.println(isOnionArray(a));

    a = new int[] {};
    System.out.println(isOnionArray(a));

    a = new int[] { -2, 5, 0, 5, 12 };
    System.out.println(isOnionArray(a));
  }

  static int isOnionArray(int[] a) {
    if (a.length <= 1) {
      return 1;
    }

    for (int j = 0, k = a.length - 1; j < k; j++, k--) {
      if (j + k == a.length - 1) {
        if (a[j] + a[k] > 10) {
          return 0;
        }
      }
    }

    return 1;
  }

}

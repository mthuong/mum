package fpp;
public class SumSafe {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 5, -5, 0 };
    System.out.println(isSumSafe(a));

    a = new int[] { 5, -2, 1 };
    System.out.println(isSumSafe(a));

    a = new int[] {};
    System.out.println(isSumSafe(a));
  }

  static int isSumSafe(int[] a) {
    if (a.length == 0) {
      return 0;
    }
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    int isSumSafe = 1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == sum) {
        isSumSafe = 0;
        break;
      }
    }
    return isSumSafe;
  }
}

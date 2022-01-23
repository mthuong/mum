package fpp;

public class IsDivisible {
  public static void main(String[] args) {
    int[] a;
    int divisor;

    a = new int[] { 3, 3, 6, 36 };
    divisor = 3;
    System.out.println(isDivisible(a, divisor));

    a = new int[] { 4 };
    divisor = 2;
    System.out.println(isDivisible(a, divisor));

    a = new int[] { 3, 4, 3, 6, 36 };
    divisor = 3;
    System.out.println(isDivisible(a, divisor));

    a = new int[] { 6, 12, 24, 36 };
    divisor = 12;
    System.out.println(isDivisible(a, divisor));

    a = new int[] {};
    divisor = 3000;
    System.out.println(isDivisible(a, divisor));
  }

  static int isDivisible(int[] a, int divisor) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] % divisor != 0) {
        return 0;
      }
    }
    return 1;
  }
}

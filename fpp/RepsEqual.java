package fpp;
public class RepsEqual {
  public static void main(String[] args) {
    int n = 32053;
    int[] a = new int[] { 3, 2, 0, 5, 3 };
    System.out.println(repsEqual(a, n));

    a = new int[] { 3, 2, 0, 5 };
    System.out.println(repsEqual(a, n));

    a = new int[] { 3, 2, 0, 5, 3, 4 };
    System.out.println(repsEqual(a, n));

    a = new int[] { 2, 3, 0, 5, 3 };
    System.out.println(repsEqual(a, n));

    a = new int[] { 9, 3, 1, 1, 2 };
    System.out.println(repsEqual(a, n));

    a = new int[] { 0, 3, 2, 0, 5, 3 };
    System.out.println(repsEqual(a, n));
  }

  static int repsEqual(int[] a, int n) {
    int aMultiplyValue = 0;
    for (int i = 0; i < a.length; i++) {
      aMultiplyValue = aMultiplyValue + a[i] * (int) Math.pow(10, a.length - i - 1);
    }
    if (aMultiplyValue == n) {
      return 1;
    }
    return 0;
  }
}

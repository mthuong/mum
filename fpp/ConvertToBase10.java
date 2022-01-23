package fpp;

public class ConvertToBase10 {
  public static void main(String[] args) {
    int[] a;
    int base;

    a = new int[] { 1, 0, 1, 1 };
    base = 2;
    System.out.println(convertToBase10(a, base));

    a = new int[] { 1, 1, 2 };
    base = 3;
    System.out.println(convertToBase10(a, base));

    a = new int[] { 3, 2, 5 };
    base = 8;
    System.out.println(convertToBase10(a, base));

    a = new int[] { 3, 7, 1 };
    base = 6;
    System.out.println(convertToBase10(a, base));
  }

  public static int convertToBase10(int[] a, int base) {
    if (IsLegalNumber.isLegalNumber(a, base) == 0) {
      return -1;
    }

    int base10Value = 0;
    for (int i = 0; i < a.length; i++) {
      base10Value += a[i] * Math.pow(base, a.length - i - 1);
    }

    return base10Value;
  }
}

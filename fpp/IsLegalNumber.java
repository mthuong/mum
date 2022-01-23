package fpp;

public class IsLegalNumber {
  public static void main(String[] args) {
    int[] a;
    int base;

    a = new int[] { 3, 2, 1 };
    base = 4;
    System.out.println(isLegalNumber(a, base));

    a = new int[] { 3, 7, 1 };
    base = 6;
    System.out.println(isLegalNumber(a, base));
  }

  public static int isLegalNumber(int[] a, int base) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] < 0 || a[i] > base) {
        return 0;
      }
    }
    return 1;
  }
}

package fpp;

public class NUnique {
  public static void main(String[] args) {
    int[] a;
    int n;

    a = new int[] { 2, 7, 3, 4 };
    n = 5;
    System.out.println(isNUnique(a, n));

    a = new int[] { 2, 3, 3, 7 };
    n = 5;
    System.out.println(isNUnique(a, n));

    a = new int[] { 7, 3, 3, 2, 4 };
    n = 6;
    System.out.println(isNUnique(a, n));

    a = new int[] { 7, 3, 3, 2, 4 };
    n = 10;
    System.out.println(isNUnique(a, n));

    a = new int[] { 7, 3, 3, 2, 4 };
    n = 11;
    System.out.println(isNUnique(a, n));

    a = new int[] { 7, 3, 3, 2, 4 };
    n = 8;
    System.out.println(isNUnique(a, n));

    a = new int[] { 7, 3, 3, 2, 4 };
    n = 4;
    System.out.println(isNUnique(a, n));

    a = new int[] { 1 };
    n = 6;
    System.out.println(isNUnique(a, n));
  }

  static int isNUnique(int[] a, int n) {
    int countUnique = 0;
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] + a[j] == n) {
          countUnique++;
        }
      }
    }

    if (countUnique == 1) {
      return 1;
    }
    return 0;
  }
}

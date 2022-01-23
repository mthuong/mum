package fpp;

public class IsMadhavArray {
  public static void main(String[] args) {
    int[] a = new int[] { 2, 1, 1 };
    System.out.println(isMadhavArray(a)); // 1

    a = new int[] { 2, 1, 1, 4, -1, -1 };
    System.out.println(isMadhavArray(a)); // 1

    a = new int[] { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 };
    System.out.println(isMadhavArray(a)); // 1

    a = new int[] { 18, 9, 10, 6, 6, 6 };
    System.out.println(isMadhavArray(a)); // 0

    a = new int[] { -6, -3, -3, 8, -5, -4 };
    System.out.println(isMadhavArray(a)); // 0

    a = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 };
    System.out.println(isMadhavArray(a)); // 1

    a = new int[] { 3, 1, 2, 3, 0 };
    System.out.println(isMadhavArray(a)); // 0
  }

  public static int isMadhavArray(int[] a) {
    if (!isValidMadhavLength(a.length))
      return 0;
    int equalValue = a[0];
    int count = 1;
    for (int i = 1; i < a.length;) {
      count++;
      int sum = 0;
      for (int j = 0; j < count; j++) {
        sum += a[i + j];
      }
      if (equalValue != sum)
        return 0;
      i += count;
    }
    return 1;
  }

  public static boolean isValidMadhavLength(int length) {
    for (int i = 0; i <= length / 2 + length % 2; i++) {
      if (i * (i + 1) / 2 == length)
        return true;
    }
    return false;
  }
}

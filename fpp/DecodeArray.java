package fpp;

public class DecodeArray {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 0, -3, 0, -4, 0 };
    System.out.println(decodeArray(a));

    a = new int[] { -1, 5, 8, 17, 15 };
    System.out.println(decodeArray(a));

    a = new int[] { 1, 5, 8, 17, 15 };
    System.out.println(decodeArray(a));

    a = new int[] { 111, 115, 118, 127, 125 };
    System.out.println(decodeArray(a));

    a = new int[] { 1, 1 };
    System.out.println(decodeArray(a));
  }

  static int decodeArray(int[] a) {
    int decode = 0;
    for (int i = a.length - 1; i > 0; i--) {
      int digit = a[i] - a[i - 1];
      if (digit < 0) {
        digit = -digit;
      }
      for (int j = i; j < a.length - 1; j++) {
        digit *= 10;
      }
      decode += digit;
    }
    if (a[0] < 0) {
      decode *= -1;
    }
    return decode;
  }
}

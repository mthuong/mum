package fpp;

public class DecodeArray1 {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 1 };
    System.out.println(decodeArray(a));

    a = new int[] { 0, 1 };
    System.out.println(decodeArray(a));

    a = new int[] { -1, 0, 1 };
    System.out.println(decodeArray(a));

    a = new int[] { 0, 1, 1, 1, 1, 1, 0, 1 };
    System.out.println(decodeArray(a));

    a = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
    System.out.println(decodeArray(a));
  }

  static int decodeArray(int[] a) {
    int multiplier = 1;
    int n = 0;
    int count = 0;
    for (int i = a.length - 1; i >= 0;) {
      count = 0;
      if (a[i] == 0) {
        i--;
        continue;
      }

      // Count 0 numbers
      for (int j = i - 1; j >= 0; j--) {
        if (a[j] == 0) {
          count++;
        } else {
          break;
        }
      }

      // Update the index
      i = i - count - 1;

      // Sum the number
      n += count * multiplier;

      // Update the multipler of the digit
      multiplier *= 10;
    }

    if (a[0] < 0) {
      return -n;
    }

    return n;
  }
}

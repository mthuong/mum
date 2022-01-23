package fpp;

import java.util.Arrays;

public class DoIntegerBasedRounding {
  public static void main(String[] args) {
    int[] a;
    int n;

    a = new int[] { 1, 2, 3, 4, 5 };
    n = 2;
    doIntegerBasedRounding(a, n);

    a = new int[] { 1, 2, 3, 4, 5 };
    n = 3;
    doIntegerBasedRounding(a, n);

    a = new int[] { 1, 2, 3, 4, 5 };
    n = -3;
    doIntegerBasedRounding(a, n);

    a = new int[] { -1, -2, -3, -4, -5 };
    n = 3;
    doIntegerBasedRounding(a, n);

    a = new int[] { -18, 1, 2, 3, 4, 5 };
    n = 4;
    doIntegerBasedRounding(a, n);

    a = new int[] { 1, 2, 3, 4, 5 };
    n = 5;
    doIntegerBasedRounding(a, n);

    a = new int[] { 1, 2, 3, 4, 5 };
    n = 100;
    doIntegerBasedRounding(a, n);
  }

  static void doIntegerBasedRounding(int[] a, int n) {
    // n <= 0, no modify
    if (n > 0) {
      for (int i = 0; i < a.length; i++) {
        // A negative element of the array is not modified
        if (a[i] < 0) {
          continue;
        }
        a[i] = basedRounding(n, a[i]);
      }
    }

    System.out.println(Arrays.toString(a));
  }

  static int basedRounding(int n, int k) {
    int i = 0, lowerNumber, upperNumber;
    do {
      lowerNumber = n * i;
      upperNumber = n * (i + 1);
      if (lowerNumber <= k && k <= upperNumber) {
        if (k - lowerNumber < upperNumber - k) {
          return lowerNumber;
        } else {
          return upperNumber;
        }
      }
      i++;
    } while (true);
  }

  // static void doIntegerBasedRounding(int[] a, int n) {
  // if (n > 0) {
  // for (int i = 0; i < a.length; i++) {
  // int j = 1;
  // if (a[i] < 0)
  // continue;
  // while (true) {
  // int prev = n * (j - 1);
  // int next = n * j;

  // if (a[i] >= prev && a[i] <= next) {
  // if (a[i] == prev)
  // a[i] = prev;
  // else if (a[i] == next)
  // a[i] = next;
  // else if (a[i] - prev == next - a[i])
  // a[i] = next;
  // else if (a[i] - prev > next - a[i])
  // a[i] = next;
  // else
  // a[i] = prev;

  // break;
  // }
  // j++;
  // }
  // }
  // }

  // System.out.println(Arrays.toString(a));
  // }
}

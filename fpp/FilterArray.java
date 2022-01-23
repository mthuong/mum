package fpp;

import java.util.Arrays;

public class FilterArray {
  public static void main(String[] args) {
    int[] a;
    int n;

    a = new int[] { 9, -9 };
    n = 0;
    System.out.println(Arrays.toString(filterArray(a, n)));

    a = new int[] { 9, -9 };
    n = 1;
    System.out.println(Arrays.toString(filterArray(a, n)));

    a = new int[] { 9, -9 };
    n = 2;
    System.out.println(Arrays.toString(filterArray(a, n)));

    a = new int[] { 9, -9 };
    n = 3;
    System.out.println(Arrays.toString(filterArray(a, n)));

    a = new int[] { 9, -9 };
    n = 4;
    System.out.println(Arrays.toString(filterArray(a, n)));

    a = new int[] { 9, -9, 5 };
    n = 3;
    System.out.println(Arrays.toString(filterArray(a, n)));

    a = new int[] { 0, 9, 12, 18, -6 };
    n = 11;
    System.out.println(Arrays.toString(filterArray(a, n)));

    a = new int[] { 8, 4, 9, 0, 3, 1, 2 };
    n = 88;
    System.out.println(Arrays.toString(filterArray(a, n)));
  }

  static int[] convertToBase2(int n) {
    int remainder, quotient = n;
    int[] base2 = new int[] {};
    do {
      remainder = quotient % 2;
      quotient = quotient / 2;

      base2 = append(base2, remainder);

    } while (quotient != 0);

    return base2;
  }

  static int[] append(int[] a, int n) {
    int[] b = new int[a.length + 1];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    }
    b[a.length] = n;
    return b;
  }

  static int[] filterArray(int[] a, int n) {
    int[] base2 = convertToBase2(n);
    int arraySize = 0;
    int indexMax = -1;
    // counting the number of 1s in the binary representation of n
    for (int i = 0; i < base2.length; i++) {
      if (base2[i] == 1) {
        arraySize++;
        indexMax = i;
      }
    }

    // Allocate an array of the required size
    int[] filterArray = new int[arraySize];

    // if the input array is not big enough to contain all the selected elements,
    // then the method returns null
    if (a.length <= indexMax) {
      return null;
    }

    int index = 0;
    for (int i = 0; i < base2.length; i++) {
      if (base2[i] == 1) {
        filterArray[index] = a[i];
        index++;
      }
    }

    return filterArray;
  }
}

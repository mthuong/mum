package fpp;

import java.util.Arrays;

public class EncodeArray1 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(encodeArray(0)));

    System.out.println(Arrays.toString(encodeArray(1)));

    System.out.println(Arrays.toString(encodeArray(-1)));

    System.out.println(Arrays.toString(encodeArray(100001)));

    System.out.println(Arrays.toString(encodeArray(999)));
  }

  static int[] encodeArray(int n) {
    int number = n;
    int length = 0;

    if (number == 0) {
      return new int[] { 1 };
    }

    if (number < 0) {
      length++;
      number = -n;
    }

    while (number != 0) {
      length += number % 10 + 1;
      number = number / 10;
    }

    int[] array = new int[length];

    number = n;
    if (number < 0) {
      array[0] = -1;
      number = -n;
    }

    while (number != 0) {
      int modulo = number % 10;
      int i = 0;
      array[--length] = 1;
      while (i < modulo) {
        array[--length] = 0;
        i++;
      }

      number = number / 10;
    }

    return array;
  }
}

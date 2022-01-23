package fpp;

import java.util.Arrays;

/**
 * EncodeNumber
 */
public class EncodeNumber {

  public static void main(String[] args) {
    int n;

    n = 2;
    System.out.println(Arrays.toString(encodeNumber(n)));

    n = 6;
    System.out.println(Arrays.toString(encodeNumber(n)));

    n = 14;
    System.out.println(Arrays.toString(encodeNumber(n)));

    n = 24;
    System.out.println(Arrays.toString(encodeNumber(n)));

    n = 1200;
    System.out.println(Arrays.toString(encodeNumber(n)));

    n = 1;
    System.out.println(Arrays.toString(encodeNumber(n)));

    n = -18;
    System.out.println(Arrays.toString(encodeNumber(n)));
  }

  static int[] encodeNumber(int n) {
    if (n <= 1) {
      return null;
    }

    // Compute the total number of prime factors including duplicates
    int number = n;
    int size = 0, i = 2;
    while (number != 1) {
      if (number % i == 0 && isPrime(i)) {
        size++;
        number = number / i;
      } else {
        i++;
      }
    }

    // Allocate an array to hold the prime factors
    int[] array = new int[size];

    i = 2;
    number = n;
    int index = 0;
    while (number != 1) {
      if (number % i == 0 && isPrime(i)) {
        array[index] = i;
        index++;
        number = number / i;
      } else {
        i++;
      }
    }

    return array;
  }

  static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }

    int sqrt = (int) Math.sqrt(n);
    for (int i = 2; i <= sqrt; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
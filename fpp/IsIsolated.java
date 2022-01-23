package fpp;

import java.util.ArrayList;
import java.util.List;

public class IsIsolated {
  public static void main(String[] args) {
    System.out.println(isIsolated(2));
    System.out.println(isIsolated(3));
    System.out.println(isIsolated(8));
    System.out.println(isIsolated(9));
    System.out.println(isIsolated(14));
    System.out.println(isIsolated(24));
    System.out.println(isIsolated(28));
    System.out.println(isIsolated(34));
    System.out.println(isIsolated(58));
    System.out.println(isIsolated(63));

    System.out.println(isIsolated(4));
    System.out.println(isIsolated(70));
    System.out.println(isIsolated(1));

    System.out.println(isIsolated(2097152));
    System.out.println(isIsolated(0));
    System.out.println(isIsolated(-1));
  }

  static int isIsolated(long n) {
    if (n > 2097151 || n < 1) {
      return -1;
    }
    long square = n * n;
    long cube = n * n * n;
    int isIsolated = 1;
    List<Integer> squareArray = new ArrayList<Integer>();

    int digit = 0;
    do {
      digit = (int) (square % 10);
      squareArray.add(Integer.valueOf(digit));
      square = square / 10;
    } while (square != 0);

    do {
      digit = (int) (cube % 10);
      for (int i = 0; i < squareArray.size(); i++) {
        Integer value = squareArray.get(i);
        if (value.intValue() == digit) {
          isIsolated = 0;
          break;
        }
      }
      if (isIsolated == 0) {
        break;
      }
      cube = cube / 10;
    } while (cube != 0);

    return isIsolated;
  }
}

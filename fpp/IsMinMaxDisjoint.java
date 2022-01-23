package fpp;

public class IsMinMaxDisjoint {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 5, 4, 1, 3, 2 };
    System.out.println(isMinMaxDisjoint(a));

    a = new int[] { 18, -1, 3, 4, 0 };
    System.out.println(isMinMaxDisjoint(a));

    a = new int[] { 9, 0, 5, 9 };
    System.out.println(isMinMaxDisjoint(a));

    a = new int[] { 0, 5, 18, 0, 9 };
    System.out.println(isMinMaxDisjoint(a));

    a = new int[] { 7, 7, 7, 7 };
    System.out.println(isMinMaxDisjoint(a));

    a = new int[] {};
    System.out.println(isMinMaxDisjoint(a));

    a = new int[] { 1, 2 };
    System.out.println(isMinMaxDisjoint(a));

    a = new int[] { 1 };
    System.out.println(isMinMaxDisjoint(a));
  }

  static int isMinMaxDisjoint(int[] a) {
    // No min and max values
    if (a.length == 0) {
      return 0;
    }
    // Init min, max variables
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    // Find min and max values
    int minIndex = -1, maxIndex = -1;
    for (int i = 0; i < a.length; i++) {
      if (min > a[i]) {
        min = a[i];
        minIndex = i;
      }
      if (max < a[i]) {
        max = a[i];
        maxIndex = i;
      }
    }

    int isMinMaxDisjoint = 1;
    // a. The minimum and maximum values of the array are not equal.
    if (min == max) {
      isMinMaxDisjoint = 0;
      return isMinMaxDisjoint;
    }

    // b. The minimum and maximum values of the array are not adjacent to one
    // another.
    if (minIndex == maxIndex - 1 || minIndex - 1 == maxIndex) {
      isMinMaxDisjoint = 0;
      return isMinMaxDisjoint;
    }

    // c. The minimum value occurs exactly once in the array.
    int countMin = 0, countMax = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == min) {
        countMin++;
      }
      if (a[i] == max) {
        countMax++;
      }
      if (countMin > 1 || countMax > 1) {
        isMinMaxDisjoint = 0;
        break;
      }
    }

    return isMinMaxDisjoint;
  }
}

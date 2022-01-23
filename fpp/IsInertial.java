package fpp;

public class IsInertial {
  public static void main(String[] args) {
    int[] a = new int[] { 11, 4, 20, 9, 2, 8 };
    System.out.println(isInertial(a));

    a = new int[] { 1 };
    System.out.println(isInertial(a));

    a = new int[] { 2 };
    System.out.println(isInertial(a));

    a = new int[] { 1, 2, 3, 4 };
    System.out.println(isInertial(a));

    a = new int[] { 1, 1, 1, 1, 1, 1, 2 };
    System.out.println(isInertial(a));

    a = new int[] { 2, 12, 4, 6, 8, 11 };
    System.out.println(isInertial(a));

    a = new int[] { 2, 12, 12, 4, 6, 8, 11 };
    System.out.println(isInertial(a));

    a = new int[] { -2, -4, -6, -8, -11 };
    System.out.println(isInertial(a));

    a = new int[] { 2, 3, 5, 7 };
    System.out.println(isInertial(a));

    a = new int[] { 2, 4, 6, 8, 10 };
    System.out.println(isInertial(a));
  }

  public static int isInertial(int[] a) {
    bubbleSort(a);
    int max = a[a.length - 1];

    // max value must be even
    if (isOdd(max))
      return 0;

    // 1 odd value
    if (a.length < 2)
      return 0;

    int nextCandidateOddValue, index;
    // every odd value is greater than every even value that is not the maximum
    // value.
    boolean evenNumbers = false;

    int step = 2;
    for (index = a.length - 2; index >= 0; index--) {
      if (step != 3) {
        nextCandidateOddValue = a[index];
        if (nextCandidateOddValue < max) {
          step = 3;
          if (!isOdd(nextCandidateOddValue))
            return 0;
        } else {
          continue;
        }
      }

      if (evenNumbers) {
        if (isOdd(a[index]))
          return 0;
      } else if (isOdd(a[index]) && index - 1 >= 0) {
        if (a[index] < a[index - 1])
          return 0;
      } else {
        evenNumbers = true;
      }
    }
    return 1;
  }

  public static boolean isOdd(int n) {
    if (n % 2 == 1)
      return true;
    return false;
  }

  public static void bubbleSort(int[] array) {
    boolean swapped = true;
    int j = 0;
    int tmp;
    while (swapped) {
      swapped = false;
      j++;
      for (int i = 0; i < array.length - j; i++) {
        if (array[i] > array[i + 1]) {
          tmp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = tmp;
          swapped = true;
        }
      }
    }
  }
}

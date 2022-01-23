package fpp;

public class IsSystematicallyIncreasing {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 1 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 1, 2 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 1, 2, 1, 2, 3 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 2, 1, 2, 3 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 1, 3 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 2, 1, 2, 1, 2 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 2, 3, 1, 2, 1 };
    System.out.println(isSystematicallyIncreasing(a));

    a = new int[] { 1, 1, 2, 3 };
    System.out.println(isSystematicallyIncreasing(a));
  }

  static int isSystematicallyIncreasing(int[] a) {
    // Recursive checking sequence
    return checkSequence(a, 0, 1);
  }

  static int checkSequence(int[] a, int startIndex, int currentSequence) {
    int isSystematicallyIncreasing = 1;
    int currentNumber = 0, i = 0, ai = 0;
    for (i = startIndex; i < a.length && isSystematicallyIncreasing == 1; i++) {
      currentNumber++;
      ai = a[i];

      if (currentSequence > ai) {
        if (currentNumber != ai) {
          isSystematicallyIncreasing = 0;
          break;
        }
      } else {
        // The last number in sequence
        if (currentNumber != ai) {
          isSystematicallyIncreasing = 0;
          break;
        } else {
          isSystematicallyIncreasing = 1;
          break;
        }
      }
    }
    if (currentNumber != currentSequence) {
      isSystematicallyIncreasing = 0;
    }
    startIndex = i + 1;
    if (startIndex < a.length && isSystematicallyIncreasing == 1) {
      return checkSequence(a, startIndex, ++currentSequence);
    } else {
      return isSystematicallyIncreasing;
    }
  }
}

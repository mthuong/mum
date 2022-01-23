package fpp;

public class RailroadTie {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 1, 2 };
    System.out.println(isRailroadTie(a));

    a = new int[] { 1, 2, 0, 1, 2, 0, 1, 2 };
    System.out.println(isRailroadTie(a));

    a = new int[] { 3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3 };
    System.out.println(isRailroadTie(a));

    a = new int[] { 0, 0, 0, 0 };
    System.out.println(isRailroadTie(a));

    a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(isRailroadTie(a));

    a = new int[] { 1, 3, 0, 3, 5, 0 };
    System.out.println(isRailroadTie(a));

    a = new int[] { 3, 3, 0, 3, 3, 0, 3, 3, 0, 3 };
    System.out.println(isRailroadTie(a));
  }

  static int isRailroadTie(int[] a) {
    int previousIndex, nextIndex, previousNumber, nextNumber;
    int isRailroadTie = 1;
    boolean contain1NonZero = false;
    int n;
    for (int i = 0; i < a.length; i++) {
      previousIndex = i - 1;
      nextIndex = i + 1;
      n = a[i];

      if (n == 0) {
        // zero

        if (previousIndex < 0) {
          // has no left non-zero neighbor
          isRailroadTie = 0;
          break;
        } else {
          previousNumber = a[previousIndex];
        }
        if (nextIndex >= a.length) {
          // has no right non-zero neighbor
          isRailroadTie = 0;
          break;
        } else {
          nextNumber = a[nextIndex];
        }

        if (previousNumber != 0 && nextNumber != 0) {
          continue;
        } else {
          isRailroadTie = 0;
          break;
        }
      } else {
        // non-zero
        contain1NonZero = true;

        if (previousIndex < 0) {
          if (nextIndex < a.length && a[nextIndex] != 0) {
            continue;
          } else {
            isRailroadTie = 0;
            break;
          }
        }

        previousNumber = a[previousIndex];

        if (nextIndex == a.length) {
          if (previousNumber == 0) {
            // b. Every non-zero element has exactly one non-zero neighbor
            isRailroadTie = 0;
            break;
          } else {
            continue;
          }
        }

        nextNumber = a[nextIndex];

        // b. Every non-zero element has exactly one non-zero neighbor
        if ((previousNumber != 0 && nextNumber == 0) || (previousNumber == 0 && nextNumber != 0)) {
          continue;
        } else {
          isRailroadTie = 0;
          break;
        }
      }
    }

    if (contain1NonZero == false) {
      isRailroadTie = 0;
    }

    return isRailroadTie;
  }
}

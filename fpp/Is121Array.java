package fpp;

public class Is121Array {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 1, 2, 1 };
    System.out.println(is121Array(a));

    a = new int[] { 1, 1, 2, 2, 2, 1, 1 };
    System.out.println(is121Array(a));

    a = new int[] { 1, 1, 2, 2, 2, 1, 1, 1 };
    System.out.println(is121Array(a));

    a = new int[] { 1, 1, 2, 1, 2, 1, 1 };
    System.out.println(is121Array(a));

    a = new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 };
    System.out.println(is121Array(a));

    a = new int[] { 1, 1, 1, 1, 1, 1 };
    System.out.println(is121Array(a));

    a = new int[] { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1 };
    System.out.println(is121Array(a));

    a = new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 2, 2 };
    System.out.println(is121Array(a));

    a = new int[] { 2, 2, 2 };
    System.out.println(is121Array(a));
  }

  static int is121Array(int[] a) {
    int step = 1;
    int count1 = 0, count1End = 0, is121Array = 1;
    for (int i = 0; i < a.length; i++) {
      int ai = a[i];

      if (step == 1 && ai == 1) {
        count1++;
      } else {
        if (ai == 2 && step == 1) {
          step = 2;
        } else {
          if (ai == 2 && step == 2) {
            continue;
          } else if (ai == 1 && step == 2) {
            step = 3;
            count1End++;
          } else if (ai == 1 && step == 3) {
            count1End++;
          } else {
            is121Array = 0;
            break;
          }
        }
      }
    }
    if (count1 != count1End || count1 == 0) {
      is121Array = 0;
    }
    return is121Array;
  }
}

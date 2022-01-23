package fpp;
public class StantonMeasure {
  public static void main(String[] args) {
    int[] a = new int[] { 1, 4, 3, 2, 1, 2, 3, 2 }; // 1 occurs 2, 2 occurs 3 => stanton is 3
    System.out.println(stantonMeasure(a));

    a = new int[] { 1 };
    System.out.println(stantonMeasure(a)); // 1 occurs 1, 1 occurs 1 => 1

    a = new int[] { 0 };
    System.out.println(stantonMeasure(a)); // 1 occurs 0, 0 occurs 1 => 1

    a = new int[] { 3, 1, 1, 4 };
    System.out.println(stantonMeasure(a)); // 1 occurs 2, 2 occurs 0 => 0

    a = new int[] { 1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4 };
    System.out.println(stantonMeasure(a)); // 1 occurs 3, 3 occurs 6 => 6

    a = new int[] {};
    System.out.println(stantonMeasure(a)); // 0 occurs 0, 0 occurs 0 => 0
  }

  public static int stantonMeasure(int[] a) {
    int count1 = 0, countN = 0;
    count1 = countNumber(1, a);
    countN = countNumber(count1, a);
    return countN;
  }

  public static int countNumber(int n, int[] a) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == n) {
        count++;
      }
    }
    return count;
  }
}

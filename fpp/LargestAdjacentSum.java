package fpp;

public class LargestAdjacentSum {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 1, 2, 3, 4 };
    System.out.println(largestAdjacentSum(a));

    a = new int[] { 18, -12, 9, -10 };
    System.out.println(largestAdjacentSum(a));

    a = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    System.out.println(largestAdjacentSum(a));

    a = new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1 };
    System.out.println(largestAdjacentSum(a));
  }

  static int largestAdjacentSum(int[] a) {
    int sum = Integer.MIN_VALUE;

    for (int i = 1; i < a.length; i++) {
      int adjacentSum = a[i - 1] + a[i];
      if (sum < adjacentSum) {
        sum = adjacentSum;
      }
    }

    return sum;
  }
}

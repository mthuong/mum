package fpp;

public class NUpCount {
  public static void main(String[] args) {
    int[] a = new int[] { 2, 3, 1, -6, 8, -3, -1, 2 };
    System.out.println(nUpCount(a, 5));

    a = new int[] { 6, 3, 1 };
    System.out.println(nUpCount(a, 1));

    a = new int[] { 1, 2, -1, 5, 3, 2, -3 };
    System.out.println(nUpCount(a, 20));
  }

  public static int nUpCount(int[] a, int n) {
    int partialSum = 0;
    int nUpCountValue = 0;
    for (int i = 0; i < a.length; i++) {
      if (partialSum <= n && a[i] + partialSum > n) {
        nUpCountValue++;
      }
      partialSum += a[i];
    }
    return nUpCountValue;
  }
}

package fpp;
public class SumFactor {
  public static void main(String[] args) {
    int[] a = new int[] { 1, -1, 1, -1, 1, -1, 1 };
    System.out.println(sumFactor(a));

    a = new int[] { 1, 2, 3, 4 };
    System.out.println(sumFactor(a));

    a = new int[] { 3, 0, 2, -5, 0 };
    System.out.println(sumFactor(a));

    a = new int[] { 9, -3, -3, -1, -1 };
    System.out.println(sumFactor(a));

    a = new int[] { 1 };
    System.out.println(sumFactor(a));

    a = new int[] { 0, 0, 0 };
    System.out.println(sumFactor(a));
  }

  public static int sumFactor(int[] a) {
    int sum = sum(a);
    int count = 0;
    for (int i : a) {
      if (sum == i) {
        count++;
      }
    }
    return count;
  }

  public static int sum(int[] a) {
    int sum = 0;
    for (int i : a) {
      sum += i;
    }
    return sum;
  }
}

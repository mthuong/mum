package fpp;

public class IsStacked {
  public static void main(String[] args) {
    System.out.println(isStacked(10));
    System.out.println(isStacked(7));
    System.out.println(isStacked(8));
    System.out.println(isStacked(9));
    System.out.println(isStacked(99));
    System.out.println(isStacked(45));
    System.out.println(isStacked(12));
  }

  static int isStacked(int n) {
    int sum = 0;
    int isStacked = 0;
    for (int i = 1; i < n / 2; i++) {
      sum += i;
      if (sum == n) {
        isStacked = 1;
      }
    }
    return isStacked;
  }
}

package fpp;

public class PrimeCount {
  public static void main(String[] args) {
    System.out.println(primeCount(10, 30)); // 6
    System.out.println(primeCount(10, 29)); // 6
    System.out.println(primeCount(20, 22)); // 0
    System.out.println(primeCount(1, 1)); // 0
    System.out.println(primeCount(5, 5)); // 1
    System.out.println(primeCount(6, 2)); // 0
    System.out.println(primeCount(-10, 6)); // 3
  }

  public static boolean isPrimeNumber(int n) {
    if (n < 2) {
      return false;
    }

    int squareRoot = (int) Math.sqrt(n);
    for (int i = 2; i <= squareRoot; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int primeCount(int start, int end) {
    int count = 0;
    for (int i = start; i <= end; i++) {
      if (isPrimeNumber(i)) {
        count++;
      }
    }
    return count;
  }
}

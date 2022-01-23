package fpp;

public class LargestPrimeFactor {
  public static void main(String[] args) {
    System.out.println(largestPrimeFactor(10));
    System.out.println(largestPrimeFactor(6936));
    System.out.println(largestPrimeFactor(1));
  }

  static int largestPrimeFactor(int n) {
    if (n <= 1) {
      return 0;
    }

    int largestPrimeFactor = 0;
    int i = 2;
    while (n != 1) {
      if (isPrime(i) && n % i == 0) {
        largestPrimeFactor = i;
        n = n / i;
      } else {
        i++;
      }
    }

    return largestPrimeFactor;
  }

  static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }

    int sqrt = (int) Math.sqrt(n);
    for (int i = 2; i <= sqrt; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

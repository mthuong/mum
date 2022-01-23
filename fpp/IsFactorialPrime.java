package fpp;

public class IsFactorialPrime {
  public static void main(String[] args) {
    System.out.println(isFactorialPrime(2));
    System.out.println(isFactorialPrime(3));
    System.out.println(isFactorialPrime(7));
    System.out.println(isFactorialPrime(8));
    System.out.println(isFactorialPrime(11));
    System.out.println(isFactorialPrime(721));
  }

  static int isFactorialPrime(int n) {
    int isFactorialPrime = 0;
    if (!isPrime(n)) {
      return 0;
    }
    for (int i = 1; i < n; i++) {
      if (n == factorial(i) + 1) {
        isFactorialPrime = 1;
        break;
      }
    }
    return isFactorialPrime;
  }

  static int factorial(int n) {
    if (n > 1) {
      return n * factorial(n - 1);
    }
    return 1;
  }

  static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }

    int sqrt = (int) Math.sqrt(n);
    int i = 2;
    while (i <= sqrt) {
      if (n % i == 0) {
        return false;
      }
      i++;
    }

    return true;
  }
}

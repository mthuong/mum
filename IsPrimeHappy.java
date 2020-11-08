public class IsPrimeHappy {
  public static void main(String[] args) {
    System.out.println(isPrimeHappy(5));

    System.out.println(isPrimeHappy(25));

    System.out.println(isPrimeHappy(32));

    System.out.println(isPrimeHappy(8));

    System.out.println(isPrimeHappy(2));
  }

  static int isPrimeHappy(int n) {
    int sum = 0;
    for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }

    if (sum > 0 && sum % n == 0) {
      return 1;
    }

    return 0;
  }

  static boolean isPrime(int n) {
    if (n < 2) {
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

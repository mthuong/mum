package fpp;

public class IsHodder {
  public static void main(String[] args) {
    // System.out.println(isHodder(3));
    // System.out.println(isHodder(7));
    // System.out.println(isHodder(31));
    // System.out.println(isHodder(127));

    for (int i = 0; i < 128; i++) {
      if (isPrime(i)) {
        System.out.println(i + " => " + isHodder(i));
      }
    }
  }

  static int isHodder(int n) {
    int isHodder = 0;
    if (isPrime(n) == false) {
      return 0;
    }

    int i = 1, temp = 0;
    while (i < n) {
      temp = pow(2, i) - 1;
      if (n == temp) {
        isHodder = 1;
        break;
      }
      i++;
    }

    return isHodder;
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

  static int pow(int n, int j) {
    int pow = 1;
    for (int i = 0; i < j; i++) {
      pow *= n;
    }
    return pow;
  }
}

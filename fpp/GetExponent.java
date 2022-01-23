package fpp;

/**
 * GetExponent
 */
public class GetExponent {

  public static void main(String[] args) {
    System.out.println(getExponent(162, 3));

    System.out.println(getExponent(27, 3));

    System.out.println(getExponent(28, 3));

    System.out.println(getExponent(280, 7));

    System.out.println(getExponent(-250, 5));

    System.out.println(getExponent(18, 1));

    System.out.println(getExponent(128, 4));
  }

  static int getExponent(int n, int p) {
    if (p <= 1) {
      return -1;
    }
    int x = 0;
    int exponent = -1;
    int pow = pow(p, x);
    while (pow <= Math.abs(n)) {
      if (n % pow == 0) {
        exponent = x;
      }
      x++;
      pow = pow(p, x);
    }

    return exponent;
  }

  static int pow(int p, int x) {
    int pow = 1;
    for (int i = 0; i < x; i++) {
      pow *= p;
    }
    return pow;
  }
}
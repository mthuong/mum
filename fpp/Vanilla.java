package fpp;
public class Vanilla {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 1 };
    System.out.println(isVanilla(a));

    a = new int[] { 11, 22, 13, 34, 125 };
    System.out.println(isVanilla(a));

    a = new int[] { 9, 999, 99999, -9999 };
    System.out.println(isVanilla(a));

    a = new int[] {};
    System.out.println(isVanilla(a));
  }

  static int isVanilla(int[] a) {
    int isVanilla = 1;

    int digit = -1;
    int otherDigit = -1;
    for (int n : a) {
      do {
        otherDigit = (int) (Math.abs(n) % 10);

        if (digit == -1) {
          digit = otherDigit;
        } else {
          if (otherDigit != digit) {
            isVanilla = 0;
            break;
          }
        }

        n = n / 10;
      } while (n != 0);
      if (isVanilla == 0) {
        break;
      }
    }

    return isVanilla;
  }
}
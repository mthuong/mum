package fpp;

public class FullnessQuotient {
  public static void main(String[] args) {
    System.out.println(fullnessQuotient(1));

    System.out.println(fullnessQuotient(9));

    System.out.println(fullnessQuotient(360));

    System.out.println(fullnessQuotient(-4));
  }

  static int fullnessQuotient(int n) {
    int fullnessQuotient = 8;

    if (n < 1) {
      return -1;
    }

    // Base 2
    String base2 = convertFromBaseToBase(n + "", 10, 2);
    fullnessQuotient -= isContainZero(base2);

    // Base 3
    String base3 = convertFromBaseToBase(n + "", 10, 3);
    fullnessQuotient -= isContainZero(base3);

    // Base 4
    String base4 = convertFromBaseToBase(n + "", 10, 4);
    fullnessQuotient -= isContainZero(base4);

    // Base 5
    String base5 = convertFromBaseToBase(n + "", 10, 5);
    fullnessQuotient -= isContainZero(base5);

    // Base 6
    String base6 = convertFromBaseToBase(n + "", 10, 6);
    fullnessQuotient -= isContainZero(base6);

    // Base 7
    String base7 = convertFromBaseToBase(n + "", 10, 7);
    fullnessQuotient -= isContainZero(base7);

    // Base 8
    String base8 = convertFromBaseToBase(n + "", 10, 8);
    fullnessQuotient -= isContainZero(base8);

    // Base 9
    String base9 = convertFromBaseToBase(n + "", 10, 9);
    fullnessQuotient -= isContainZero(base9);

    return fullnessQuotient;
  }

  static String convertFromBaseToBase(String str, int fromBase, int toBase) {
    return Integer.toString(Integer.parseInt(str, fromBase), toBase);
  }

  static int isContainZero(String str) {
    int isContainZero = 0;
    for (int i = 0; i < str.length(); i++) {
      String c = str.substring(i, i + 1);
      if (Integer.parseInt(c) == 0) {
        isContainZero = 1;
        break;
      }
    }
    return isContainZero;
  }
}

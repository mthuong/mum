package fpp;

public class IsDigitIncreasing {
  public static void main(String[] args) {
    System.out.println(isDigitIncreasing(7));

    System.out.println(isDigitIncreasing(36));

    System.out.println(isDigitIncreasing(984));

    System.out.println(isDigitIncreasing(7404));

    System.out.println(isDigitIncreasing(1000));
  }

  static int isDigitIncreasing(int n) {
    int number = n;
    int temp = 1, sum = 0;
    int isDigitIncreasing = 0;

    int numberDigits = 0;
    while (number != 0) {
      number = number / 10;
      numberDigits++;
    }

    for (int i = 1; i <= 9; i++) {
      number = n;
      temp = 0;
      sum = 0;

      for (int j = 0; j < numberDigits; j++) {
        temp += pow10(j) * i;
        sum += temp;
      }

      if (sum == n) {
        isDigitIncreasing = 1;
        break;
      }
    }

    return isDigitIncreasing;
  }

  static int pow10(int n) {
    int pow10 = 1;
    for (int i = 0; i < n; i++) {
      pow10 *= 10;
    }
    return pow10;
  }
}

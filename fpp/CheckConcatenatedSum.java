package fpp;

public class CheckConcatenatedSum {
  public static void main(String[] args) {
    System.out.println(checkConcatenatedSum(198, 2));
    System.out.println(checkConcatenatedSum(198, 3));
    System.out.println(checkConcatenatedSum(2997, 3));
    System.out.println(checkConcatenatedSum(2997, 2));
    System.out.println(checkConcatenatedSum(13332, 4));
    System.out.println(checkConcatenatedSum(9, 1));
  }

  static int checkConcatenatedSum(int n, int catlen) {
    int checkConcatenatedSum = 1;
    int number = n;
    int sum = 0;
    while (number % 10 != 0) {
      sum += concatenateDigit(number % 10, catlen);
      number = number / 10;
    }
    if (sum != n) {
      checkConcatenatedSum = 0;
    }

    return checkConcatenatedSum;
  }

  static int concatenateDigit(int n, int catlen) {
    int concatenateDigit = n;
    for (int i = 1; i < catlen; i++) {
      int multiplier = 10;
      for (int j = 1; j < i; j++) {
        multiplier *= 10;
      }
      concatenateDigit += n * multiplier;
    }
    return concatenateDigit;
  }
}

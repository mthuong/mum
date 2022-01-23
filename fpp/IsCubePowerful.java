package fpp;

public class IsCubePowerful {
  public static void main(String[] args) {
    System.out.println(isCubePowerful(153));

    System.out.println(isCubePowerful(370));

    System.out.println(isCubePowerful(371));

    System.out.println(isCubePowerful(407));

    System.out.println(isCubePowerful(87));

    System.out.println(isCubePowerful(0));

    System.out.println(isCubePowerful(-81));

  }

  static int isCubePowerful(int n) {
    // n must be greater than 0
    if (n <= 0) {
      return 0;
    }
    int sum = 0;
    int number = n;
    while (number != 0) {
      int digit = number % 10;
      sum += digit * digit * digit;
      number = number / 10;
    }

    if (sum == n) {
      return 1;
    }
    return 0;
  }
}

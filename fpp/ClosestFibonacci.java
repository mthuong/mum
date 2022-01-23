package fpp;

public class ClosestFibonacci {
  public static void main(String[] args) {
    System.out.println(closestFibonacci(13));
    System.out.println(closestFibonacci(33));
    System.out.println(closestFibonacci(34));
    System.out.println(closestFibonacci(0));
    System.out.println(closestFibonacci(1));
    System.out.println(closestFibonacci(2));
    System.out.println(closestFibonacci(3));
  }

  static int closestFibonacci(int n) {
    if (n < 1) {
      return 0;
    }
    int fibonacci = 1;
    if (n == 1) {
      fibonacci = 1;
    }
    int fibo1 = 1;
    int fibo2 = 1;

    while (fibonacci < n) {
      fibonacci = fibo1 + fibo2;

      if (fibonacci > n) {
        fibonacci = fibo1;
        break;
      }
      fibo2 = fibo1;
      fibo1 = fibonacci;
    }

    return fibonacci;
  }

}

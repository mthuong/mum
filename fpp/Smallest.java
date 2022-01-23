package fpp;
public class Smallest {
  public static void main(String[] args) {
    System.out.println(smallest(4));

    System.out.println(smallest(5));

    System.out.println(smallest(6));

    System.out.println(smallest(7));
  }

  static int smallest(int n) {
    int max = Integer.MAX_VALUE;
    int count = 0;
    int smallest = 0;
    for (int i = 1; i < max; i++) {
      count = 0;
      for (int j = 1; j <= n; j++) {
        int number = i * j;
        do {
          if (number % 10 == 2) {
            count++;
            break;
          } else {
            number = number / 10;
          }
        } while (number != 0);
        if (count != j) {
          break;
        }
      }
      if (count == n) {
        smallest = i;
        break;
      }
    }

    return smallest;
  }
}

package fpp;

public class GuthrieIndex {
  public static void main(String[] args) {
    System.out.println(guthrieIndex(7));
    System.out.println(guthrieIndex(1));
    System.out.println(guthrieIndex(2));
    System.out.println(guthrieIndex(3));
    System.out.println(guthrieIndex(4));
    System.out.println(guthrieIndex(42));
  }

  public static int guthrieIndex(int n) {
    int count = 0, number = n;
    while (number != 1) {
      count++;
      number = nextGuthrieNumber(number);
    }

    return count;
  }

  public static int nextGuthrieNumber(int n) {
    if (n % 2 == 0) {
      // even
      return n / 2;
    } else {
      // odd
      return n * 3 + 1;
    }
  }
}

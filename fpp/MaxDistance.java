package fpp;

import java.util.ArrayList;
import java.util.List;

public class MaxDistance {
  public static void main(String[] args) {
    int n = 12;
    System.out.println(maxDistance(n));

    n = 49;
    System.out.println(maxDistance(n));

    n = 13;
    System.out.println(maxDistance(n));
  }
  
  static int maxDistance(int n) {
    List<Integer> factors = new ArrayList<>();
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        factors.add(i);
      }
    }

    if (factors.size() == 1) {
      return 0;
    }

    if (factors.size() == 0) {
      return -1;
    }

    return factors.get(factors.size() - 1) - factors.get(0);
  }
}

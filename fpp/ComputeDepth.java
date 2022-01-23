package fpp;

import java.util.ArrayList;
import java.util.List;

public class ComputeDepth {
  public static void main(String[] args) {
    int n;

    n = 42;
    System.out.println(computeDepth(n));

    n = 7;
    System.out.println(computeDepth(n));

    n = 13;
    System.out.println(computeDepth(n));

    n = 25;
    System.out.println(computeDepth(n));
  }

  static int computeDepth(int n) {
    int max = Integer.MAX_VALUE;
    List<Integer> digits = new ArrayList<Integer>();

    int depth = 0;
    for (int i = 1; i < max; i++) {
      int value = n * i;
      int newCandidateDigit;
      do {
        newCandidateDigit = value % 10;

        if (digits.size() == 0) {
          digits.add(Integer.valueOf(newCandidateDigit));
        } else {
          boolean isNew = true;
          for (Integer digit : digits) {
            int digitValue = digit.intValue();
            if (digitValue == newCandidateDigit) {
              isNew = false;
              break;
            }
          }
          if (isNew) {
            digits.add(Integer.valueOf(newCandidateDigit));
            if (digits.size() == 10) {
              break;
            }
          }
        }
        value = value / 10;
      } while (value != 0);
      if (digits.size() == 10) {
        depth = i;
        break;
      }
    }
    return depth;
  }
}

package fpp;

public class MatchPattern {
  public static void main(String[] args) {
    int[] a, pattern;
    int len, patternLen;

    a = new int[] { 1, 1, 1, 2, 2, 1, 1, 3 };
    pattern = new int[] { 1, 2, 1, 3 };
    len = a.length;
    patternLen = pattern.length;
    System.out.println(matchPattern(a, len, pattern, patternLen));

    a = new int[] { 1, 1, 1, 1, 1 };
    pattern = new int[] { 1 };
    len = a.length;
    patternLen = pattern.length;
    System.out.println(matchPattern(a, len, pattern, patternLen));

    a = new int[] { 1 };
    pattern = new int[] { 1 };
    len = a.length;
    patternLen = pattern.length;
    System.out.println(matchPattern(a, len, pattern, patternLen));

    a = new int[] { 1, 1, 2, 2, 2, 2 };
    pattern = new int[] { 1, 2 };
    len = a.length;
    patternLen = pattern.length;
    System.out.println(matchPattern(a, len, pattern, patternLen));

    a = new int[] { 1, 2, 3 };
    pattern = new int[] { 1, 2 };
    len = a.length;
    patternLen = pattern.length;
    System.out.println(matchPattern(a, len, pattern, patternLen));

    a = new int[] { 1, 2 };
    pattern = new int[] { 1, 2, 3 };
    len = a.length;
    patternLen = pattern.length;
    System.out.println(matchPattern(a, len, pattern, patternLen));

    a = new int[] { 1, 1, 2, 2, 2, 2, 3 };
    pattern = new int[] { 1, 3 };
    len = a.length;
    patternLen = pattern.length;
    System.out.println(matchPattern(a, len, pattern, patternLen));

    a = new int[] { 1, 1, 1, 1 };
    pattern = new int[] { 1, 2 };
    len = a.length;
    patternLen = pattern.length;
    System.out.println(matchPattern(a, len, pattern, patternLen));

    a = new int[] { 1, 1, 1, 1, 2, 2, 3, 3 };
    pattern = new int[] { 1, 2 };
    len = a.length;
    patternLen = pattern.length;
    System.out.println(matchPattern(a, len, pattern, patternLen));

    a = new int[] { 1, 1, 10, 4, 4, 3 };
    pattern = new int[] { 1, 4, 3 };
    len = a.length;
    patternLen = pattern.length;
    System.out.println(matchPattern(a, len, pattern, patternLen));
  }

  static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
    // len is the number of elements in the array a, patternLen is the number of
    // elements in the pattern.
    int i = 0; // index into a
    int k = 0; // index into pattern
    int matches = 0; // how many times current pattern character has been matched so far
    for (i = 0; i < len; i++) {
      if (a[i] == pattern[k])
        matches++; // current pattern character was matched
      else if (matches == 0 || k == patternLen - 1)
        return 0; // if pattern[k] was never matched (matches==0) or at end of pattern
                  // (k==patternLen-1)
      else // advance to next pattern character
      {
        // !!You write this code!!
        // End of current pattern move to next pattern
        if (a[i] != pattern[k]) {
          k++;

          // End of pattern array and current number is not match last pattern
          if (k == patternLen) {
            return 0;
          }

          // If current number not match the next pattern => return 0
          if (a[i] != pattern[k]) {
            return 0;
          }
          // Matched so move to next number
          matches = 1;
        } else {
          // current number still in current pattern
          continue;
        }
      } // end of else
    } // end of for
      // return 1 if at end of array a (i==len) and also at end of pattern
      // (k==patternLen-1)
    if (i == len && k == patternLen - 1)
      return 1;
    else
      return 0;
  }
}

package fpp;

public class AreAnagrams {
  public static void main(String[] args) {
    char[] a1, a2;

    a1 = new char[] { 's', 'i', 't' };
    a2 = new char[] { 't', 'i', 's' };
    System.out.println(areAnagrams(a1, a2));

    a1 = new char[] { 's', 'i', 't' };
    a2 = new char[] { 'i', 'd', 's' };
    System.out.println(areAnagrams(a1, a2));

    a1 = new char[] { 'b', 'i', 'g' };
    a2 = new char[] { 'b', 'i', 't' };
    System.out.println(areAnagrams(a1, a2));

    a1 = new char[] { 'b', 'o', 'g' };
    a2 = new char[] { 'b', 'o', 'o' };
    System.out.println(areAnagrams(a1, a2));

    a1 = new char[] {};
    a2 = new char[] {};
    System.out.println(areAnagrams(a1, a2));

    a1 = new char[] { 'b', 'i', 'g' };
    a2 = new char[] { 'b', 'i', 'g' };
    System.out.println(areAnagrams(a1, a2));

    a1 = new char[] { 'p', 'o', 'o', 'l' };
    a2 = new char[] { 'p', 'o', 'l', 'l' };
    System.out.println(areAnagrams(a1, a2));
  }

  static int areAnagrams(char[] a1, char[] a2) {
    if (a1.length != a2.length) {
      return 0;
    }

    int areAnagrams = 1;

    int i = 0, sum1 = 0, sum2 = 0;

    while (i < a1.length) {
      sum1 += a1[i];
      sum2 += a2[i];
      i++;
    }

    if (sum1 != sum2) {
      areAnagrams = 0;
    }

    return areAnagrams;
  }
}

package fpp;
public class Trivalent {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { -1, 0, 1, 0, 0, 0 };
    System.out.println(isTrivalent(a));

    a = new int[] {};
    System.out.println(isTrivalent(a));

    a = new int[] { 2147483647, -1, -1, -2147483648 };
    System.out.println(isTrivalent(a));
  }

  static int isTrivalent(int[] a) {
    int isTrivalent = 1;

    int[] elements = new int[] {};
    boolean isNewElement = true;

    for (int n : a) {
      isNewElement = true;
      for (int value : elements) {
        if (value == n) {
          isNewElement = false;
          break;
        }
      }
      if (isNewElement) {
        elements = append(elements, n);
      }
    }
    if (elements.length != 3) {
      isTrivalent = 0;
    }

    return isTrivalent;
  }

  static int[] append(int[] a, int n) {
    int[] array = new int[a.length + 1];
    for (int i = 0; i < a.length; i++) {
      array[i] = a[i];
    }
    array[a.length] = n;
    return array;
  }
}

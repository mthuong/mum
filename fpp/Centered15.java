package fpp;

public class Centered15 {

  public static void main(String[] args) {
    int[] a = new int[] { 3, 2, 10, 4, 1, 6, 9 }; // 1
    System.out.println(isCentered15(a));

    a = new int[] { 2, 10, 4, 1, 6, 9 }; // 0
    System.out.println(isCentered15(a));

    a = new int[] { 3, 2, 10, 4, 1, 6 }; // 0
    System.out.println(isCentered15(a));

    a = new int[] { 1, 1, 8, 3, 1, 1 }; // 1
    System.out.println(isCentered15(a));

    a = new int[] { 9, 15, 6 }; // 1
    System.out.println(isCentered15(a));

    a = new int[] { 1, 1, 2, 2, 1, 1 }; // 0
    System.out.println(isCentered15(a));

    a = new int[] { 1, 1, 15 - 1, -1 }; // 1
    System.out.println(isCentered15(a));
  }

  static int isCentered15(int[] a) {
    int middleIndex = (int) Math.round(a.length / 2.0);
    int sum = 0;
    for (int i = 0; i < middleIndex; i++) {
      sum = 0;
      for (int j = i; j < a.length - i; j++) {
        sum += a[j];
      }
      if (sum == 15) {
        return 1;
      }
    }

    return 0;
  }

  // static int isCentered15(int[] a) {
  // int isCentered15 = 0;
  // int lowerIndex = 0;
  // int upperIndex = 0;
  // int sum = 0;
  // if (a.length % 2 == 0) {
  // lowerIndex = (a.length / 2) - 1;
  // upperIndex = a.length / 2;
  // } else {
  // lowerIndex = (a.length - 1) / 2;
  // upperIndex = lowerIndex;
  // }
  // while (lowerIndex >= 0 && upperIndex < a.length) {
  // sum = 0;
  // for (int index = lowerIndex; index <= upperIndex; index++) {
  // sum += a[index];
  // }
  // if (sum == 15) {
  // isCentered15 = 1;
  // break;
  // }
  // lowerIndex--;
  // upperIndex++;
  // }
  // return isCentered15;
  // }
}

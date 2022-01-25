package fpp;

import java.util.Arrays;

public class UpdateMileage {
  public static void main(String[] args) {
    int[] a = new int[] { 8, 9, 9, 5, 0 };
    int miles = 1;
    updateMileage(a, miles);
    System.out.println(Arrays.toString(a));

    a = new int[] { 8, 9, 9, 5, 0 };
    miles = 2;
    updateMileage(a, miles);
    System.out.println(Arrays.toString(a));

    a = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    miles = 1;
    updateMileage(a, miles);
    System.out.println(Arrays.toString(a));

    a = new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    miles = 13;
    updateMileage(a, miles);
    System.out.println(Arrays.toString(a));
  }

  static void updateMileage(int[] a, int miles) {
    for (int i = 1; i <= miles; i++) {
      for (int j = 0; j < a.length; j++) {
        int aj = a[j];
        if (aj + 1 == 10) {
          a[j] = 0;
        } else {
          a[j] += 1;
          break;
        }
      }
    }
  }
}

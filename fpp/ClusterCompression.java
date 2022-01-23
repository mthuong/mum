package fpp;

import java.util.Arrays;

public class ClusterCompression {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 0, 0, 0, 2, 0, 2, 0, 2, 0, 0 };
    System.out.println(Arrays.toString(clusterCompression(a)));

    a = new int[] { 18 };
    System.out.println(Arrays.toString(clusterCompression(a)));

    a = new int[] {};
    System.out.println(Arrays.toString(clusterCompression(a)));

    a = new int[] { -5, -5, -5, -5, -5 };
    System.out.println(Arrays.toString(clusterCompression(a)));

    a = new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1 };
    System.out.println(Arrays.toString(clusterCompression(a)));

    a = new int[] { 8, 8, 6, 6, -2, -2, -2 };
    System.out.println(Arrays.toString(clusterCompression(a)));
  }

  static int[] clusterCompression(int[] a) {
    int[] clusterCompression = new int[] {};
    int replacesCluster = 0;
    for (int i = 0; i < a.length; i++) {
      int n = a[i];
      if (clusterCompression.length == 0) {
        clusterCompression = append(clusterCompression, n);
      } else {
        replacesCluster = clusterCompression[clusterCompression.length - 1];
        if (replacesCluster != n) {
          clusterCompression = append(clusterCompression, n);
        }
      }
    }
    return clusterCompression;
  }

  static int[] append(int[] a, int n) {
    int[] b = new int[a.length + 1];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    }
    b[b.length - 1] = n;
    return b;
  }
}

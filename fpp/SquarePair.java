package fpp;
// public class SquarePair {
//   public static void main(String[] args) {
//     int[] a = new int[] { 11, 5, 4, 20 };
//     System.out.println(countSquarePairs(a));

//     a = new int[] { 9, 0, 2, -5, 7 };
//     System.out.println(countSquarePairs(a));

//     a = new int[] { 9 };
//     System.out.println(countSquarePairs(a));
//   }

//   public static int countSquarePairs(int[] a) {
//     int count = 0;
//     for (int i = 0; i < a.length - 1; i++) {
//       int ai = a[i];
//       if (ai <= 0) {
//         continue;
//       }
//       for (int j = i + 1; j < a.length; j++) {
//         int aj = a[j];
//         if (aj <= 0) {
//           continue;
//         }
//         int sum = ai + aj;
//         if (isPerfectSquare(sum) == 1 && ai != aj) {
//           count++;
//         }
//       }
//     }

//     return count;
//   }

//   public static int isPerfectSquare(int n) {
//     int squareRoot = (int) Math.sqrt(n);
//     if (squareRoot * squareRoot == n) {
//       return 1;
//     }
//     return 0;
//   }

// }

public class SquarePair {
  public static void main(String[] args) {
    int[] a = new int[] { 9, 0, 2, -5, 7 };
    System.out.println(countSquarePairs(a));

    a = new int[] { 9 };
    System.out.println(countSquarePairs(a));
  }

  static int countSquarePairs(int[] a) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      int ai = a[i];
      if (ai <= 0) {
        // Square pair must be non-zero integers
        continue;
      }

      for (int j = i + 1; j < a.length; j++) {
        int aj = a[j];
        if (aj <= 0) {
          // Square pair must be non-zero integers
          continue;
        }

        int sum = ai + aj;
        if (isPerfectSquare(sum) == 1 && ai != aj) {
          count++;
        }
      }
    }

    return count;
  }

  public static int isPerfectSquare(int n) {
    int squareRoot = (int) Math.sqrt(n);
    if (squareRoot * squareRoot == n) {
      return 1;
    }
    return 0;
  }
}
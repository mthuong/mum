package fpp;

class NextPerfectSquare {
  public static void main(String[] args) {
    System.out.println(nextPerfectSquare(6));

    System.out.println(nextPerfectSquare(36));

    System.out.println(nextPerfectSquare(0));

    System.out.println(nextPerfectSquare(-5));
  }

  public static int nextPerfectSquare(int n) {
    if (n < 0)
      return 0;
    boolean goNext = true;
    int nextPerfectSquareNumber = n;
    do {
      int result = isPerfectSquare(++nextPerfectSquareNumber);
      if (result != -1) {
        nextPerfectSquareNumber = result;
        goNext = false;
      }
    } while (goNext);
    return nextPerfectSquareNumber;
  }

  public static int isPerfectSquare(int n) {
    int squareRoot = (int) Math.sqrt(n);
    if (squareRoot * squareRoot == n) {
      return n;
    }
    return -1;
  }
}

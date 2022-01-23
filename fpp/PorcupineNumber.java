package fpp;

public class PorcupineNumber {
  public static void main(String[] args) {
    System.out.println(findPorcupineNumber(0)); // 139 - 149

    System.out.println(findPorcupineNumber(138));

    System.out.println(findPorcupineNumber(139));
  }

  public static int findPorcupineNumber(int n) {
    int porcupineCandidate = n;
    int nextPrime;
    while (true) {
      porcupineCandidate++;
      porcupineCandidate = findPrime(porcupineCandidate);
      if (porcupineCandidate % 10 == 9) {
        nextPrime = findPrime(porcupineCandidate + 1);
        if (nextPrime % 10 == 9) {
          return porcupineCandidate;
        }
      }
    }
  }

  public static int findPrime(int n) {
    int primeNumberCandidate = n;
    while (true) {
      if (isPrime(primeNumberCandidate) == 1) {
        return primeNumberCandidate;
      }
      primeNumberCandidate++;
    }
  }

  public static int isPrime(int n) {
    if (n < 2) {
      return 0;
    }

    int squareRoot = (int) Math.sqrt(n);
    for (int i = 2; i <= squareRoot; i++) {
      if (n % i == 0) {
        return 0;
      }
    }
    return 1;
  }
}

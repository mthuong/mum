// void main(String[] args) {
//   int result;

//   result = isPrimeHappy(5);
//   result = isPrimeHappy(25);
//   result = isPrimeHappy(32);
//   result = isPrimeHappy(8);
//   result = isPrimeHappy(2);
// }

// int isPrimeHappy(int n) {
//   int sum = 0;

//   // Find all primes less than n and sum all of them
//   for (int i = 2; i < n; i++) {
//     if (isPrime(i)) {
//       sum += i;
//     }
//   }

//   int isPrimeHappy = 0;
//   // If sum == 0 that mean, there is no prime less than n
//   if (sum == 0) {
//     isPrimeHappy = 0;
//     return isPrimeHappy;
//   }

//   // the sum of all primes less than n is evenly divisible by n
//   if (sum % n == 0) {
//     isPrimeHappy = 1;
//   }

//   return isPrimeHappy;
// }

// boolean isPrime(int n) {
//   if (n < 2) {
//     return false;
//   }

//   for (int i = 2; i < n; i++) {
//     if (n % i == 0) {
//       return false;
//     }
//   }

//   return true;
// }
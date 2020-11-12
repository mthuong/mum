// void main(String[] args) {
// int closestFibonacci;

// closestFibonacci = closestFibonacci(12);
// closestFibonacci = closestFibonacci(33);
// closestFibonacci = closestFibonacci(34);
// closestFibonacci = closestFibonacci(0);
// closestFibonacci = closestFibonacci(1);
// closestFibonacci = closestFibonacci(2);
// }

// int closestFibonacci(int n) {
// // If the argument is less than 1 return 0
// if (n < 1) {
// return 0;
// }

// // The first 2 fibonacci numbers
// int fibo1 = 1, fibo2 = 1;
// int closestFibonacci = 1;

// while (closestFibonacci < n) {
// if (fibo1 + fibo2 <= n) {
// // Update the closed fibonacci
// closestFibonacci = fibo1 + fibo2;
// // Save new 2 fibonacci numbers
// fibo2 = fibo1;
// fibo1 = closestFibonacci;
// } else {
// // Found the closest fibonacci numbers, then finish and return the result
// break;
// }
// }

// return closestFibonacci;
// }

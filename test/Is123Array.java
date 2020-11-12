// void main(String[] args) {
// int[] a;

// a = new int[] { 1, 2, 3, 3, 2, 1 };
// int result = is123Array(a);

// a = new int[] { 0, 1, 2, 3, 1, 2, 3 };
// result = is123Array(a);

// a = new int[] { 1, 2, 3, 3, 2, 1, 1, 2, 3 };
// result = is123Array(a);

// a = new int[] { 1, 2, 3 };
// result = is123Array(a);

// a = new int[] {};
// result = is123Array(a);
// }

// int is123Array(int[] a) {
// int is123Array = 1;

// // the input array must contain at least one 1, 2, 3 triad
// if (a.length < 3) {
// return 0;
// }

// int currentNumber = 1;
// for (int i = 0; i < a.length; i++) {
// // Check the current element must be equal to the current number in the triad
// if (a[i] != currentNumber) {
// is123Array = 0;
// break;
// } else {
// // Update the next number must be matched
// if (currentNumber == 3) {
// currentNumber = 1;
// } else {
// currentNumber++;
// }
// }
// }

// // The current number variable must be 1 because it's the end of triad after
// // loop to the end
// // of array
// if (currentNumber != 1) {
// is123Array = 0;
// }

// return is123Array;
// }
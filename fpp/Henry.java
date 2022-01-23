package fpp;

public class Henry {
  public static void main(String[] args) {
    int henry = henry(1, 4);
    System.out.println(henry);
  }

  static int henry(int i, int j) {
    int henry = 0;
    int iPerfectNumber = perfectNumber(i);
    int jPerfectNumber = perfectNumber(j);

    henry = iPerfectNumber + jPerfectNumber;

    return henry;
  }

  private static int perfectNumber(int index) {
    int max = Integer.MAX_VALUE;
    int sum = 0;
    int count = 0;
    for (int number = 1; number < max; number++) {
      sum = 0;
      for (int divider = 1; divider < number; divider++) {
        if (number % divider == 0) {
          sum += divider;
        }
      }
      if (sum == number) {
        count++;
        if (count == index) {
          System.out.println("perfectNumber: " + number + " - index at: " + index);
          return number;
        }
      }
    }
    return 0;
  }

  // static int henry(int i, int j){
  // int henry = 0;
  // int max = Integer.MAX_VALUE;
  // int perfectCount = 0;
  // for(int number=1; number <= max; number++){
  // int sum = 0;
  // for(int divider = 1; divider < number; divider++){
  // if(number % divider == 0){
  // sum += divider;
  // }
  // }
  // if(sum == number){
  // perfectCount++;
  // if(perfectCount == i){
  // henry += sum;
  // }else if(perfectCount == j){
  // henry += sum;
  // break;
  // }
  // }
  // }
  // return henry;
  // }
}

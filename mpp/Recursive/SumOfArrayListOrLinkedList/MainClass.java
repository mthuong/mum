package mpp.Recursive.SumOfArrayListOrLinkedList;

import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.List;

public class MainClass {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    int sum = sum(list);
    System.out.println(sum);
  }

  static int sum(List<Integer> list) {
    if (list.size() == 0) {
      return 0;
    }
    return list.get(0) + sum(list.subList(1, list.size()));
  }
}
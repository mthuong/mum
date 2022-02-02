package mpp.Recursive.RemoveDuplicationFromArrayList;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("1");
    list.add("2");
    list.add("4");
    list.add("3");
    list.add("1");
    ArrayList<String> result = removeDuplications(list);
    System.out.println("result: " + result.toString());

    list = new ArrayList<>();
    list.add("1");
    list.add("2");
    list.add("4");
    list.add("3");
    list.add("1");
    result = removeDupsHead(list);
    System.out.println("result remove duplicate from head: " + result.toString());
  }

  static ArrayList<String> removeDuplications(ArrayList<String> list) {
    if (list.size() <= 1) {
      return list;
    }
    ArrayList<String> result = new ArrayList<String>();
    String firstItem = list.remove(0);
    if (list.size() > 0) {
      result.addAll(removeDuplications(list));
    }
    if (!result.contains(firstItem)) {
      result.add(firstItem);
    }
    return result;
  }

  public static ArrayList<String> removeDupsHead(List<String> input) {
    ArrayList<String> result = new ArrayList<String>();
    if (input.isEmpty()) {
      return result;
    }
    String a = input.remove(0);
    if (!input.contains(a)) {
      result.add(a);
    }
    result.addAll(removeDupsHead(input));
    return result;
  }
}
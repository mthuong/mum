package mpp.Recursive.RemoveDuplicateItemsFromLinkedList;

import java.util.LinkedList;

public class MainClass {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("1");
    list.add("2");
    list.add("1");
    list.add("2");
    list.add("3");
    LinkedList<String> result = removeDuplications(list);
    System.out.println("Result: " + result.toString());

    list = new LinkedList<String>();
    list.add("1");
    list.add("2");
    list.add("1");
    list.add("2");
    list.add("3");
    result = removeDuplicationsPlain(list);
    System.out.println("Result plain solution: " + result.toString());
  }

  static LinkedList<String> removeDuplications(LinkedList<String> list) {
    if (list.size() < 2) {
      return list;
    }
    LinkedList<String> result = new LinkedList<>();
    String lastItem = list.removeLast();
    if (list.size() > 0) {
      result.addAll(removeDuplications(list));
    }
    if (!result.contains(lastItem)) {
      result.add(lastItem);
    }
    return result;
  }

  static LinkedList<String> removeDuplicationsPlain(LinkedList<String> list) {
    if (list.size() < 2) {
      return list;
    }
    LinkedList<String> result = new LinkedList<>();
    for (String item : list) {
      if (!result.contains(item)) {
        result.add(item);
      }  
    }
    
    return result;
  }
}
package mpp.Recursive.RemoveDuplicateItemsFromLinkedList;

import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {
		MainClass mainClass = new MainClass();

		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("2");
		LinkedList<String> result = mainClass.removeDuplications(list);
		System.out.println("Result: " + result.toString());
	}

	LinkedList<String> removeDuplications(LinkedList<String> list) {
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
}
package mpp.Recursive.ReverseAList;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		List<String> result = mainClass.reverseListRecursively(list);
		System.out.println("result: " + result.toString());
	}

	/**
	 * * A recursive algorithm to reverse a List in Java * *
	 * 
	 * @param list * @return
	 */
	private List<String> reverseListRecursively(List<String> list) {
		if (list.size() <= 1) {
			return list;
		}
		List<String> reversed = new ArrayList<>();
		reversed.add(list.get(list.size() - 1)); // last element
		reversed.addAll(reverseListRecursively(list.subList(0, list.size() - 1)));
		return reversed;
	}
}

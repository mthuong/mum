package mpp.Recursive.AtLeastTwice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class AtLeastTwice {

	Set<String> set1 = new HashSet<>();
	Set<String> set2 = new HashSet<>();
	LinkedList<String> returnList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtLeastTwice mainClass = new AtLeastTwice();
		LinkedList<String> result;
		LinkedList<String> list = new LinkedList<String>();
		mainClass.set1.clear();
		mainClass.set2.clear();
		list.add("a");
		list.add("b");
		list.add("b");
		result = mainClass.atLeastTwice(list);
		System.out.println("Result: " + result.toString());

		list = new LinkedList<String>(Arrays.asList("a", "b", "a", "b", "c", "b"));
		mainClass.set1.clear();
		mainClass.set2.clear();
		result = mainClass.atLeastTwice(list);
		System.out.println("Result: " + result.toString());

		list = new LinkedList<String>(Arrays.asList("c", "a", "b"));
		mainClass.set1.clear();
		mainClass.set2.clear();
		result = mainClass.atLeastTwice(list);
		System.out.println("Result: " + result.toString());

		list = new LinkedList<String>(Arrays.asList("c", "c", "c", "c"));
		mainClass.set1.clear();
		mainClass.set2.clear();
		result = mainClass.atLeastTwice(list);
		System.out.println("Result: " + result.toString());
	}	

	LinkedList<String> atLeastTwice(LinkedList<String> list) {

		if (list.size() == 0) {
			returnList = new LinkedList<String>(set2);
			return returnList;
		}

		String firstItem = list.removeFirst();

		if (!set1.contains(firstItem)) {
			set1.add(firstItem);
		} else {
			set2.add(firstItem);
		}

		return atLeastTwice(list);
	}

}

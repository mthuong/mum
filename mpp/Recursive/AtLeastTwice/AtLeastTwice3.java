package mpp.Recursive.AtLeastTwice;

import java.util.LinkedList;

public class AtLeastTwice3 {
	public static void main(String[] args) {
		AtLeastTwice3 atLeastTwice = new AtLeastTwice3();
		LinkedList<String> inputList1 = new LinkedList<>();
		inputList1.add("a");
		inputList1.add("b");
		inputList1.add("b");
		LinkedList<String> inputList2 = new LinkedList<>();
		inputList2.add("a");
		inputList2.add("b");
		inputList2.add("a");
		inputList2.add("b");
		inputList2.add("c");
		inputList2.add("b");
		LinkedList<String> inputList3 = new LinkedList<>();
		inputList3.add("c");
		inputList3.add("b");
		inputList3.add("a");
		LinkedList<String> inputList4 = new LinkedList<>();
		inputList4.add("c");
		inputList4.add("c");
		inputList4.add("c");
		inputList4.add("c");
		System.out.println(atLeastTwice.atLeastTwice(inputList1).toString());
		atLeastTwice.returnList = new LinkedList<>();
		System.out.println(atLeastTwice.atLeastTwice(inputList2).toString());
		atLeastTwice.returnList = new LinkedList<>();
		System.out.println(atLeastTwice.atLeastTwice(inputList3).toString());
		atLeastTwice.returnList = new LinkedList<>();
		System.out.println(atLeastTwice.atLeastTwice(inputList4).toString());
	}

	LinkedList<String> returnList = new LinkedList<>();

	LinkedList<String> atLeastTwice(LinkedList<String> list) {
		LinkedList<String> tempList = new LinkedList<>(list);
		if (tempList.isEmpty()) {
			return tempList;
		}
		String firstElement = tempList.remove(0);		
		if (!returnList.contains(firstElement) && tempList.contains(firstElement)) {
			returnList.add(firstElement);
		}
		atLeastTwice(tempList);
		return returnList;
	}

}

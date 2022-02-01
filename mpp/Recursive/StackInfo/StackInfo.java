package mpp.Recursive.StackInfo;

import mpp.Recursive.StackInfo.IntStack.Node;

public class StackInfo {

	public IntStack mainStack;
	public IntStack tempStack;

	public boolean find(Integer num) {
		// TODO: Unimplemented method

		Node firstNode = mainStack.pop();
		// Can not find the number
		if (firstNode == null) {
			return false;
		}

		// Found the number
		if (firstNode.data == num) {
			// Merge main stack
			mainStack.push(firstNode.data);
			tempStack.pop();
			return true;
		}
		boolean isFound = find(num);

		// Merge main stack
		mainStack.push(firstNode.data);
		tempStack.pop();

		return isFound;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInfo stack = new StackInfo();
		stack.mainStack = new IntStack();
		stack.mainStack.push(4);
		stack.mainStack.push(6);
		stack.mainStack.push(2);
		stack.mainStack.push(3);
		stack.tempStack = new IntStack();
		System.out.println(stack.mainStack.toString() + " - " + stack.tempStack.toString());
		System.out.println("Find 6: " + stack.find(6));
		System.out.println(stack.mainStack.toString() + " - " + stack.tempStack.toString());
		System.out.println("Find 1: " + stack.find(1));
		System.out.println(stack.mainStack.toString() + " - " + stack.tempStack.toString());
		System.out.println("Find 2: " + stack.find(2));
		System.out.println(stack.mainStack.toString() + " - " + stack.tempStack.toString());
		System.out.println("Find 5: " + stack.find(5));
		System.out.println(stack.mainStack.toString() + " - " + stack.tempStack.toString());
	}
}

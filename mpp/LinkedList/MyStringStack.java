package mpp.LinkedList;

public class MyStringStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringStack stack = new MyStringStack();
		stack.push("A");
		stack.push("B");
		System.out.println("Stack: " + stack.toString());
		try {
			stack.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		stack.push("C");
		System.out.println("Stack: " + stack.toString());
	}

	class Node {
		String data;
		Node nextNode;

		public Node(String data) {
			this.data = data;
			nextNode = null;
		}
	}

	private Node top = null;
	private int size = 0;

	@Override
	public String toString() {
		String result = "";
		Node currNode = top;
		while (currNode != null) {
			result += currNode.data + " ";
			currNode = currNode.nextNode;
		}
		return result.trim();
	}

	public void push(String data) {
		if (data != null) {
			Node newNode = new Node(data);
			if (top == null) {
				top = newNode;
			} else {
				newNode.nextNode = top;
				top = newNode;
			}
			size++;
		}
	}

	public Node pop() {
		if (size == 0) {
			top = null;
			return null;
		} else {
			Node node = top;
			top = top.nextNode;
			size--;
			return node;
		}
	}

}

package mpp.LinkedList;

public class Stack {
	class Node {
		String data;
		Node nextNode;

		public Node(String data) {
			this.data = data;
			nextNode = null;
		}
	}

	private Node head = null;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public void push(String item) {
		Node newNode = new Node(item);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.nextNode = head;
			head = newNode;
		}
		size++;
	}

	public String pop() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty");
		Node currNode = head;
		head = currNode.nextNode;
		currNode.nextNode = null;
		return currNode.data;
	}

	public String peek() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty");
		return head.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		String result = "";
		Node currNode = head;
		while (currNode != null) {
			result += currNode.data;
			currNode = currNode.nextNode;
		}
		return result;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
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
}

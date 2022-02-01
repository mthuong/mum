package mpp.LinkedList;

public class MyStringLinkedList {

	class Node {
		public Node nextNode;
		public String value;

		public Node(String value) {
			this.value = value;
			this.nextNode = null;
		}
	}

	Node head;
	Node tail;

	public void addNode(String value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.nextNode = node;
			tail = node;
		}
	}

	public boolean removeNode(String value) {
		Node temp = head;
		Node prev = null;
		// If head is value.
		if (temp != null && temp.value == value) {
			head = temp.nextNode;
			return true;
		}
		// Search value
		while (temp != null && temp.value != value) {
			prev = temp;
			temp = temp.nextNode;
		}
		// Search to the end and doesn't find any value
		if (temp == null) {
			return false;
		}
		// Replace prev with the next value of temp.
		prev.nextNode = temp.nextNode;
		return true;
	}

	public void printNodes() {
		Node iterator = head;
		System.out.print("[");
		while (iterator != null) {
			if (iterator.nextNode != null) {
				System.out.print(iterator.value + ", ");
			} else {
				System.out.print(iterator.value + "");
			}
			iterator = iterator.nextNode;
		}
		System.out.println("]");
	}

	public void addFirst(String value) {

		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.nextNode = head;
			head = node;
		}
	}

	public void addLast(String value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.nextNode = node;
			tail = node;
		}
	}

	public void removeFirst() {
		if (head == null) {
			return;
		}
		head = head.nextNode;
	}

	public void removeLast() {
		if (head == null) {
			return;
		}
		Node temp = head;
		Node prev = null;
		while (temp.nextNode != null) {
			prev = temp;
			temp = temp.nextNode;
		}
		prev.nextNode = null;
		tail = prev;
	}
	
	public String findMin() {
		if (head == null && tail == null) {
			return null;
		}
		
		Node temp = head;
		String min = null;
		while (temp != null) {
			if (min == null) {
				min = temp.value;
			} else if (min.compareTo(temp.value) > 0) {
				min = temp.value; 
			}
			temp = temp.nextNode;
		}
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringLinkedList list = new MyStringLinkedList();
        list.addLast("Harry");
        list.addLast("Bob");
        list.addLast("Steve");
        String min = list.findMin();
        System.out.println(min);
	}

}

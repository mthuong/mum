package prob2;

/**
 * Implement the add, remove, and toString methods of this class 
 *
 */
public class MyArrayList {
	//DO NOT MODIFY THIS LINE OF CODE
	private String[] arr = new String[8];
	
	private int size = 0;
	
	private void resize() {
		String [] temp = new String[size + 8];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	//Adds String s to the end of the list
	public void add(String s) {
		//implement
		if (s == null) {
			return;
		}
		
		if (size >= arr.length) {
			// Resize the array
			resize();
		}
		
		arr[size] = s;
		size++;
	}
	
	//Removes and returns the String that is in position k in the list
	public String remove(int k) {
		//implement
		if (k < 0 || k >= size) {
			return null;
		}
		
		String value = arr[k];
		
		for (int i = 0; i < size; i++) {
			if (i > k) {
				arr[i - 1] = arr[i];
			}
		}
		
		// Reduce size
		size--;
		
		return value;
	}
	
	//Returns a string representation of this list
	//Example: After you add Strings 
	//    Bob
	//    Steve
	//    John
	//to an initially empty list, the output of the toString() method
	//should be:
	//   [Bob, Steve, John]
	public String toString() {
		//implement
		String result = "[";
		for (int i = 0; i < size; i++) {
			if (i > 0) {
				result += ", ";
			}
			String ai = arr[i];
			result += ai;
		}
		result += "]";
		return result;
	}
	
	//DO NOT MODIFY
	public String get(int i) throws Exception {
		try {
			return arr[i];
		} catch(NullPointerException e1) {
			throw new Exception("NullPointerException");
			
		} catch(ArrayIndexOutOfBoundsException e2) {
			throw new Exception("ArrayIndexOutOfBoundsException");
		}
	}
	
	//Test your code using this main method 
	public static void main(String[] args) {
		testZeroElements();
		testAdd();
		testRemoveFromEnd();
		testRemoveFromFront();
		testRemoveFromMiddle();
		testResize();
	}
	
	//expected output:  []
	public static void testZeroElements() {
		MyArrayList list = new MyArrayList();
		System.out.println(list);
	}
	
	//expected output: [Joe, Bob, Steve]
	public static void testAdd() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		System.out.println(list);
	}
	//expected output [Joe, Bob]
	public static void testRemoveFromEnd() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		list.remove(2);
		System.out.println(list);
	}
	//expected output: [Bob, Steve]
	public static void testRemoveFromFront() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		list.remove(0);
		System.out.println(list);
	}
	//expected output:  [Joe, Steve]
	public static void testRemoveFromMiddle() {
		MyArrayList list = new MyArrayList();
		list.add("Joe");
		list.add("Bob");
		list.add("Steve");
		list.remove(1);
		System.out.println(list);
	}
	
	//expected: no exception is thrown
	public static void testResize() {
		MyArrayList list = new MyArrayList();
		try {
			list.add("Joe");
			list.add("Bob");
			list.add("Steve");
			list.add("Joey");
			list.add("Bobby");
			list.add("Stevie");
			list.add("Tony");
			list.add("Tom");
			list.add("Tania");
			list.add("Dave");
			list.add("Dick");
			list.add("Rich");
			System.out.println(list);
		} catch(Exception e) {
			System.out.println("Exception trying to add 12 Strings to the list: " 
					+ e.getClass().getSimpleName());
		}	
	}
}

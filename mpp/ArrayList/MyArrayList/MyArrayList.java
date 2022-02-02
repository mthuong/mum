package mpp.ArrayList.MyArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList array = new MyArrayList();
		System.out.println(array.toString());
		array.add("A");
		array.add("B");
		System.out.println(array.toString());
		array.add("C");
		System.out.println(array.toString());
		String removeValue = array.remove(1);
		System.out.println("Removed value: " + removeValue);
		System.out.println(array.toString());
		array.add("D");
		System.out.println(array.toString());
		array.remove(array.size - 1);
		System.out.println(array.toString());
	}

	// DO NOT MODIFIED THIS LINE OF CODE
	private String[] arr = new String[8];

	public int size = 0;

	public void add(String value) {
		// Do not allow null value to be added in the list
		if (value == null)
			return;

		if (size >= arr.length) {
			// Resize the array
			resizeArray(1);
		}

		arr[size] = value;
		size++;
	}

	private void resizeArray(int length) {
		String[] newArray = new String[arr.length + length];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		arr = newArray;
	}

	@Override
	public String toString() {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			String value = arr[i];
			if (value == null)
				continue;

			if (i != 0) {
				result += ",";
			}
			result += arr[i];
		}
		result += "]";
		return result;
	}

	public String remove(int k) {
		if (k > size || k < 0) {
			return null;
		}
		String kValue = arr[k];
		for (int i = 0; i < size - 1; i++) {
			if (i >= k) {
				arr[i] = arr[i + 1];
			}
		}
		// Update last item
		arr[size - 1] = null;

		// Update size
		size--;

		return kValue;
	}
}

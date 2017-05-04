/* Implementing a fixed capacity (array-based) stack of string, based on lecture for week 2 */

public class FixedCapacityStackOfStrings {
	private String[] s;
	private int count = 0;

	public FixedCapacityStackOfStrings(int capacity) {
		s = new String[capacity];
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public void push(String item) {
		// doing the increment (++) after will increment the count var **after** the 
		// array has already been accessed at the original count index
		s[count++] = item; 
	}

	public String pop() {
		// doing the decrement (--) before will decrement the count var **before** the 
		// array has already been accessed at the original count index
		return s[--count];
	}
}
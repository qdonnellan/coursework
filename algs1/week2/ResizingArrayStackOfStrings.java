public class ResizingArrayStackOfStrings {
	private String[] s;
	private int count = 0;

	public ResizingArrayStackOfStrings() {
		// During constructor, create an array with a single element.
		s = new String[1];
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public void push(String item) {
		// If the length of the array is maxed out, then double it!
		if (count == s.length) {
			resize(2 * s.length);
		}
		s[count++] = item; 
	}

	public String pop() {
		// If the array is less than half full, half the array
		if (count <= s.length / 2) {
			resize(s.length / 2);
		}
		return s[--count];
	}

	/**
	 * Resize the array by creating a temp array with a new capacity, then copying over
	 * the exisitng elements in the old array into the new temp array, and then dropping
	 * reference to the old array by replacing it with reference to the temp array
	 */
	private void resize(int capacity) {
		String[] tempS = new String[capacity];
		for (int i = 0; i < count; i++) {
			tempS[i] = s[i];
		}
		s = tempS;
	}

	public int capacity() {
		return s.length;
	}

}
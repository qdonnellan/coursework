/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 2 - Stacks and Queues"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/UAJbP/lecture-slides
 */

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
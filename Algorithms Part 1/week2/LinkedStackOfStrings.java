/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 2 - Stacks and Queues"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/UAJbP/lecture-slides
 */

public class LinkedStackOfStrings {
	private Node first = null;

	private class Node {
		String item;
		Node next;

		public Node(String item, Node next) {
			this.item = item;
			this.next = next;
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void push(String item) {
		first = new Node(item, first);
	}

	public String pop() {
		String item = first.item;
		first = first.next;
		return item;
	}
}
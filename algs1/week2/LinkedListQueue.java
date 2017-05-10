/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 2 - Stacks and Queues"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/UAJbP/lecture-slides
 */

public class LinkedListQueue {
	private Node first, last;

	private class Node {
		String item;
		Node next;

		public Node(String item) {
			this.item = item;
		}
	}

	public void enqueue(String item) {
		Node oldLast = last;
		last = new Node(item);

		if (first == null) {
			first = last;
		} else {
			oldLast.next = last;
		}
	}

	public String dequeue() {
		String item = first.item;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return item;
	}
}
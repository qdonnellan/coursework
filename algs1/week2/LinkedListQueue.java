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
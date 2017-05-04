public class LinkedListQueueTest {
	public void test() {
		test_enqueue_then_dequeue();
	}

	private void test_enqueue_then_dequeue() {
		LinkedListQueue queue = new LinkedListQueue();
		queue.enqueue("first");
		queue.enqueue("second");
		queue.enqueue("third");
		assert queue.dequeue() == "first";
		assert queue.dequeue() == "second";
		assert queue.dequeue() == "third";
	}

	/* Run with "java -ea LinkedListQueueTest" */
	public static void main(String[] args) {
		LinkedListQueueTest test = new LinkedListQueueTest();
		test.test();
	}
}
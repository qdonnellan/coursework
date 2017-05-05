import static org.junit.Assert.*;
import org.junit.Test;


public class LinkedListQueueTest {

	@Test
	public void test_enqueue_then_dequeue() {
		LinkedListQueue queue = new LinkedListQueue();
		queue.enqueue("first");
		queue.enqueue("second");
		queue.enqueue("third");
		assertEquals(queue.dequeue(), "first");
		assertEquals(queue.dequeue(), "second");
		assertEquals(queue.dequeue(), "third");
	}
}
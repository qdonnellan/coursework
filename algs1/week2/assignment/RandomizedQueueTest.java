import static org.junit.Assert.*;
import org.junit.Test;
import java.util.NoSuchElementException;

public class RandomizedQueueTest {

    @Test
    public void test_initially_empty_queue() {
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        assertTrue(queue.isEmpty());
        assertEquals(queue.size(), 0);
    }

    @Test
    public void test_some_enqueues_and_dequeues() {
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assertFalse(queue.isEmpty());
        assertEquals(queue.size(), 3);
        String result1 = queue.dequeue();
        String result2 = queue.dequeue();
        String result3 = queue.dequeue();
        assertEquals(queue.size(), 0);
        assertTrue(result1 == "A" || result1 == "B" || result1 == "C");
        assertTrue(result2 == "A" || result2 == "B" || result2 == "C");
        assertTrue(result3 == "A" || result3 == "B" || result3 == "C");
        assertTrue(result1 != result2);
        assertTrue(result1 != result3);
        assertTrue(result2 != result3);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void test_iterating_through_queue() {
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        for (String s: queue) {
            assertTrue(s == "A" || s == "B" || s == "C");
        }
    }

    @Test
    public void test_random_sample() {
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        String sample = queue.sample();
        assertTrue(sample == "A" || sample == "B" || sample == "C");
    }

    @Test(expected=NullPointerException.class)
    public void test_attempt_to_add_null_item() {
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        queue.enqueue(null);
    }

    @Test(expected=NoSuchElementException.class)
    public void test_dequeue_when_queue_is_empty() {
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        queue.dequeue();
    }

    @Test(expected=NoSuchElementException.class)
    public void test_sample_when_queue_is_empty() {
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        queue.sample();
    }

    @Test(expected=UnsupportedOperationException.class)
    public void test_attempt_to_call_remove_method_on_iterator() {
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        queue.iterator().remove();
    }

    @Test(expected=NoSuchElementException.class)
    public void test_attempt_to_call_iterator_next_on_empty_queue() {
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        queue.iterator().next();
    }
}
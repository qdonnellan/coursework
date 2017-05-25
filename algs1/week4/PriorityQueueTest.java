import static org.junit.Assert.*;
import org.junit.Test;

public class PriorityQueueTest {

    @Test
    public void test_simple_queue_pq() {
        MaxPriorityQueue<Integer> q = new MaxPriorityQueue<Integer>(4);
        q.insert(7);
        q.insert(5);
        q.insert(11);
        q.insert(9);
        assertEquals((Integer) 11, (Integer) q.deleteMax());
        assertEquals((Integer) 9, (Integer) q.deleteMax());
        assertEquals((Integer) 7, (Integer) q.deleteMax());
        assertEquals((Integer) 5, (Integer) q.deleteMax());
    }

    @Test
    public void test_simple_binay_heap_pq() {
        BinaryHeapPriorityQueue<Integer> heap = new BinaryHeapPriorityQueue<Integer>(4);
        heap.insert(7);
        heap.insert(5);
        heap.insert(11);
        heap.insert(9);
        assertEquals((Integer) 11, (Integer) heap.deleteMax());
        assertEquals((Integer) 9, (Integer) heap.deleteMax());
        assertEquals((Integer) 7, (Integer) heap.deleteMax());
        assertEquals((Integer) 5, (Integer) heap.deleteMax());
    }
}
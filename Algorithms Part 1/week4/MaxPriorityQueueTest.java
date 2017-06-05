import static org.junit.Assert.*;
import org.junit.Test;

public class MaxPriorityQueueTest {

    @Test
    public void test_simple_queue() {
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
}
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.NoSuchElementException;


public class DequeTest {

    @Test
    public void test_empty_deque() {
        Deque<String> deque = new Deque<String>();
        assertTrue(deque.isEmpty());
        assertEquals(deque.size(), 0);
    }

    @Test
    public void test_add_to_first_remove_from_last() {
        Deque<String> deque = new Deque<String>();
        deque.addFirst("A");
        String last = deque.removeLast();
        assertEquals(last, "A");
    }

    @Test
    public void test_add_to_first_remove_from_first() {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(0);
        deque.removeFirst();
        assertTrue(deque.isEmpty());
    }

    @Test
    public void test_add_to_last_remove_from_first() {
        Deque<String> deque = new Deque<String>();
        deque.addLast("A");
        String last = deque.removeFirst();
        assertEquals(last, "A");
    }

    @Test
    public void test_add_remove_add_remove() {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(0);
        assertEquals(deque.removeFirst(), (Integer) 0);
        deque.addFirst(2);
        assertEquals(deque.removeLast(), (Integer) 2);
    }

    @Test
    public void test_add_remove_add_remove_another_way() {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addLast(0);
        assertEquals(deque.removeLast(), (Integer) 0);
        deque.addLast(2);
        assertEquals(deque.removeFirst(), (Integer) 2);
    }

    @Test
    public void test_add_to_front_twice_remove_from_last_twice() {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(0);
        assertEquals(deque.removeLast(), (Integer) 0);
        deque.addFirst(2);
        assertEquals(deque.removeLast(), (Integer) 2);
    }

    @Test
    public void test_series_if_adds_and_removes_from_deque() {
        Deque<String> deque = new Deque<String>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");
        assertEquals(deque.size(), 3);
        assertEquals(deque.removeLast(), "C");
        assertEquals(deque.size(), 2);
        deque.addFirst("D");
        deque.addFirst("E");
        assertEquals(deque.size(), 4);
        assertEquals(deque.removeLast(), "B");
        assertEquals(deque.removeLast(), "A");
        assertEquals(deque.removeLast(), "D");
        assertEquals(deque.removeLast(), "E");
        assertEquals(deque.size(), 0);
    }

    @Test
    public void test_adding_on_both_sides_then_removing_from_the_front() {
        Deque<String> deque = new Deque<String>();
        deque.addFirst("A");
        deque.addLast("B");
        assertEquals(deque.size(), 2);
        assertEquals(deque.removeFirst(), "A");
        assertEquals(deque.removeFirst(), "B");
    }

    @Test
    public void test_iterator_after_adding_then_removing_from_front() {
        Deque<String> deque = new Deque<String>();
        deque.addFirst("A");
        deque.removeLast();
        int length = 0;
        for (String s: deque) {
            length++;
        }
        assertEquals(deque.size(), 0);
        assertEquals(length, 0);
    }

    @Test(expected=NullPointerException.class)
    public void test_adding_null_element_to_front() {
        Deque<String> deque = new Deque<String>();
        deque.addFirst(null);
    }

    @Test(expected=NullPointerException.class)
    public void test_adding_null_element_to_end() {
        Deque<String> deque = new Deque<String>();
        deque.addLast(null);
    }

    @Test(expected=NoSuchElementException.class)
    public void test_removing_item_from_front_of_empty_deque() {
        Deque<String> deque = new Deque<String>();
        deque.removeFirst();
    }

    @Test(expected=NoSuchElementException.class)
    public void test_removing_item_from_back_of_empty_deque() {
        Deque<String> deque = new Deque<String>();
        deque.removeLast();
    }

    @Test(expected=UnsupportedOperationException.class)
    public void test_calling_remove_on_the_iterator() {
        Deque<String> deque = new Deque<String>();
        deque.iterator().remove();
    }

    @Test(expected=NoSuchElementException.class)
    public void test_calling_next_when_empty() {
        Deque<String> deque = new Deque<String>();
        deque.iterator().next();
    }
}
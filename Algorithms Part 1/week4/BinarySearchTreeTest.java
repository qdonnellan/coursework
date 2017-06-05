import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void test_series_of_gets_and_puts() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<Integer, String>();
        bst.put(1, "world");
        bst.put(2, "Bar");
        assertEquals("world", bst.get(1));
        assertEquals("Bar", bst.get(2));
    }

    @Test
    public void test_floor() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<Integer, String>();
        bst.put(1, "a");
        bst.put(2, "b");
        bst.put(3, "c");
        bst.put(5, "d");
        assertEquals((Integer) 3, bst.floor(4));
    }

    @Test
    public void test_size() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<Integer, String>();
        bst.put(1, "a");
        bst.put(2, "b");
        bst.put(3, "c");
        bst.put(5, "d");
        assertEquals((Integer) 4, (Integer) bst.size());
    }


}
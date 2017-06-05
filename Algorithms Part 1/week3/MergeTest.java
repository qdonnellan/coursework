import static org.junit.Assert.*;
import org.junit.Test;

public class MergeTest {

    @Test
    public void test_merging_two_arrays() {
        Integer[] a = new Integer[]{1, 2, 3, 4};
        Integer[] b = new Integer[]{9, 10, 11, 12};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 9, 10, 11, 12};
        Integer[] result = Merge.merge(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void test_merging_two_arrays_of_different_size() {
        Integer[] a = new Integer[]{1, 2, 3, 4, 5};
        Integer[] b = new Integer[]{9, 10, 11, 12};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 9, 10, 11, 12};
        Integer[] result = Merge.merge(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void test_merging_two_arrays_of_different_size_again() {
        Integer[] a = new Integer[]{1, 2, 3, 4};
        Integer[] b = new Integer[]{8, 9, 10, 11, 12};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 8, 9, 10, 11, 12};
        Integer[] result = Merge.merge(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void test_merging_two_arrays_with_duplicates() {
        Integer[] a = new Integer[]{1, 2, 3, 4};
        Integer[] b = new Integer[]{1, 2, 3, 4};
        Integer[] expected = new Integer[]{1, 1, 2, 2, 3, 3, 4, 4};
        Integer[] result = Merge.merge(a, b);
        assertEquals(expected, result);
    }
}

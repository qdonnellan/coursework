import static org.junit.Assert.*;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void test_merging_two_arrays() {
        Integer[] a = new Integer[]{9, 10, 11, 12, 1, 2, 3, 4};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 9, 10, 11, 12};
        int lo = 0;
        int mid = 3;
        int hi = 7;
        MergeSort.merge(a, new Comparable[8], lo, mid, hi);
        assertEquals(expected, a);
    }

    /**
     * Just because I want to see this work with two very different sized arrays!
     */
    @Test
    public void test_merging_two_arrays_of_different_lengths() {
        Integer[] a = new Integer[]{9, 10, 1, 2, 3, 4, 5, 6};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6, 9, 10};
        int lo = 0;
        int mid = 1;
        int hi = 7;
        MergeSort.merge(a, new Comparable[8], lo, mid, hi);
        assertEquals(expected, a);
    }

        /**
     * Just because I want to see this work with two very different sized arrays!
     */
    @Test
    public void test_merge_sort() {
        Integer[] a = new Integer[]{7, 1, 4, 5, 9, 8, 2, 3, 6};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        MergeSort.mergeSort(a);
        assertEquals(expected, a);
    }
}

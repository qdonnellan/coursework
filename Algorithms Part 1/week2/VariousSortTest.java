import static org.junit.Assert.*;
import org.junit.Test;

public class VariousSortTest {

    @Test
    public void test_sorting_array_of_sortable_dates_with_selection_sort() {
        SortableDate[] dates = new SortableDate[3];
        SortableDate d1 = new SortableDate(8, 10, 2015);
        SortableDate d2 = new SortableDate(8, 9, 2015);
        SortableDate d3 = new SortableDate(8, 11, 2015);
        dates[0] = d1;
        dates[1] = d2;
        dates[2] = d3;

        SelectionSort.sort(dates);
        assertEquals(dates[0], d2);
        assertEquals(dates[1], d1);
        assertEquals(dates[2], d3);
    }

    @Test
    public void test_sorting_array_of_sortable_dates_with_insertion_sort() {
        SortableDate[] dates = new SortableDate[3];
        SortableDate d1 = new SortableDate(8, 10, 2015);
        SortableDate d2 = new SortableDate(8, 9, 2015);
        SortableDate d3 = new SortableDate(8, 11, 2015);
        dates[0] = d1;
        dates[1] = d2;
        dates[2] = d3;

        InsertionSort.sort(dates);
        assertEquals(dates[0], d2);
        assertEquals(dates[1], d1);
        assertEquals(dates[2], d3);
    }
}

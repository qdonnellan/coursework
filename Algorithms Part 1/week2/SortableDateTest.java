import static org.junit.Assert.*;
import org.junit.Test;

public class SortableDateTest {

    @Test
    public void test_comparing_two_dates() {
        SortableDate d1 = new SortableDate(8, 30, 2017);
        SortableDate d2 = new SortableDate(8, 30, 2016);
        assertEquals(d1.compareTo(d2), 1);
        assertEquals(d2.compareTo(d1), -1);
    }

    @Test
    public void test_comparing_two_equal_dates() {
        SortableDate d1 = new SortableDate(8, 30, 2017);
        SortableDate d2 = new SortableDate(8, 30, 2017);
        assertEquals(d1.compareTo(d2), 0);
        assertEquals(d2.compareTo(d1), 0);
    }
}

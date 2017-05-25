import static org.junit.Assert.*;
import org.junit.Test;


public class PointTest {

    @Test
    public void test_compare_to_method() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(2, 1);
        assertEquals(p1.compareTo(p2), -1);
        assertEquals(p2.compareTo(p1), 1);
        assertEquals(p1.compareTo(p1), 0);
        assertEquals(p1.compareTo(p3), 1);
        assertEquals(p3.compareTo(p2), -1);
        assertEquals(p3.compareTo(p1), -1);
    }

    @Test
    public void test_infinity_slope() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 3);
        Double slope1 = p1.slopeTo(p2);
        Double slope2 = p2.slopeTo(p1);
        assertTrue(slope1 == Double.POSITIVE_INFINITY);
        assertTrue(slope2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test_degenerate_slope() {
        Point p1 = new Point(246, 185);
        Double slope1 = p1.slopeTo(p1);
        assertTrue(slope1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test_zero_slope() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(10, 2);
        Double slope = p1.slopeTo(p2);
        assertTrue(slope == 0.0);
    }

    @Test
    public void test_normal_slope() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 2);
        Double slope = p1.slopeTo(p2);
        assertTrue(slope == 1.0);
    }

    @Test
    public void test_slope_order() {
        Point origin = new Point(0, 0);
        Point p1 = new Point(2, 2);
        Point p2 = new Point(2, 1);
        Point p3 = new Point(1, 2);
        Point p4 = new Point(4, 4);
        Point p5 = new Point(5, 5);

        assertTrue(origin.slopeTo(p1) == 1.0);
        assertTrue(origin.slopeTo(p2) == 0.5);
        assertTrue(origin.slopeTo(p3) == 2.0);

        assertEquals(origin.slopeOrder().compare(p2, p1), -1);
        assertEquals(origin.slopeOrder().compare(p3, p1), 1);
        assertEquals(origin.slopeOrder().compare(p4, p5), 0);
    }
}

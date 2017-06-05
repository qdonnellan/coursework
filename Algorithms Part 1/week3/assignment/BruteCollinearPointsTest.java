import static org.junit.Assert.*;
import org.junit.Test;


public class BruteCollinearPointsTest {

    @Test
    public void test_no_collinear_points() {
        Point[] points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(1, 0);
        points[3] = new Point(0, 10);
        BruteCollinearPoints bcp = new BruteCollinearPoints(points);
        assertEquals(0, bcp.segments().length);
        assertEquals(0, bcp.numberOfSegments());
    }

    @Test
    public void test_collinear_points() {
        Point[] points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 1);
        points[2] = new Point(2, 2);
        points[3] = new Point(3, 3);
        BruteCollinearPoints bcp = new BruteCollinearPoints(points);
        assertEquals(1, bcp.segments().length);
        assertEquals(1, bcp.numberOfSegments());
    }

    @Test
    public void test_two_sets_of_collinear_points() {
        Point[] points = new Point[7];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 1);
        points[2] = new Point(2, 2);
        points[3] = new Point(3, 3);
        points[4] = new Point(4, 0);
        points[5] = new Point(5, 0);
        points[6] = new Point(6, 0);
        BruteCollinearPoints bcp = new BruteCollinearPoints(points);
        assertEquals(2, bcp.segments().length);
        assertEquals(2, bcp.numberOfSegments());
    }

    @Test
    public void test_two_sets_of_collinear_points_random_order() {
        Point[] points = new Point[7];
        points[6] = new Point(0, 0);
        points[4] = new Point(1, 1);
        points[2] = new Point(2, 2);
        points[5] = new Point(3, 3);
        points[3] = new Point(4, 0);
        points[1] = new Point(5, 0);
        points[0] = new Point(6, 0);
        BruteCollinearPoints bcp = new BruteCollinearPoints(points);
        assertEquals(2, bcp.segments().length);
        assertEquals(2, bcp.numberOfSegments());
    }

    @Test(expected=IllegalArgumentException.class)
    public void test_repeated_points() {
        Point[] points = new Point[2];
        points[0] = new Point(0, 0);
        points[1] = new Point(0, 0);
        BruteCollinearPoints bcp = new BruteCollinearPoints(points);
    }

    @Test(expected=IllegalArgumentException.class)
    public void test_repeated_points_separated_by_valid_points() {
        Point[] points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(0, 1);
        points[3] = new Point(0, 0);
        BruteCollinearPoints bcp = new BruteCollinearPoints(points);
    }

    @Test(expected=NullPointerException.class)
    public void test_null_point() {
        Point[] points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = null;
        points[3] = new Point(2, 1);
        BruteCollinearPoints bcp = new BruteCollinearPoints(points);
    }

    @Test(expected=NullPointerException.class)
    public void test_null_point_array() {
        BruteCollinearPoints bcp = new BruteCollinearPoints(null);
    }
}
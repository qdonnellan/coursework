import static org.junit.Assert.*;
import org.junit.Test;

public class PercolationTest {

    @Test
    public void test_initially_has_no_open_sites_and_does_not_percolate() {
        Percolation p = new Percolation(10);
        assertEquals(p.numberOfOpenSites(), 0);
        assertFalse(p.percolates());
    }

    @Test
    public void test_opening_a_site() {
        Percolation p = new Percolation(10);
        p.open(1, 1);
        assertTrue(p.isOpen(1, 1));
    }

    @Test
    public void test_percolating_straight_down() {
        Percolation p = new Percolation(3);
        p.open(1, 1);
        p.open(2, 1);
        p.open(3, 1);
        assertTrue(p.percolates());
        assertEquals(p.numberOfOpenSites(), 3);
    }

    @Test
    public void test_zig_zag_percolation_from_top() {
        Percolation p = new Percolation(4);
        p.open(1, 1);
        p.open(2, 1);
        p.open(2, 2);
        p.open(3, 2);
        p.open(3, 3);
        p.open(4, 3);
        assertTrue(p.percolates());
        assertEquals(p.numberOfOpenSites(), 6);
    }

    @Test
    public void test_bottom_up_percolation() {
        Percolation p = new Percolation(3);
        p.open(3, 1);
        p.open(2, 1);
        p.open(1, 1);
        assertTrue(p.percolates());
        assertEquals(p.numberOfOpenSites(), 3);
    }

    @Test
    public void test_bottom_up_percolation_stopping_befure_it_percolates() {
        Percolation p = new Percolation(4);
        p.open(4, 1);
        p.open(3, 1);
        p.open(2, 1);
        assertFalse(p.percolates());
        assertEquals(p.numberOfOpenSites(), 3);
    }

    @Test
    public void test_is_full_but_not_percolates() {
        Percolation p = new Percolation(4);
        p.open(3, 1);
        p.open(2, 1);
        p.open(1, 1);
        assertFalse(p.percolates());
        assertTrue(p.isFull(3, 1));
        assertTrue(p.isFull(2, 1));
        assertTrue(p.isFull(1, 1));
        assertFalse(p.isFull(4, 1));
    }

    @Test(expected=IllegalArgumentException.class)
    public void test_invalid_constructor_argument() {
        Percolation p = new Percolation(0);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void test_invalid_open_site() {
        Percolation p = new Percolation(10);
        p.open(0, 0);
    }
}
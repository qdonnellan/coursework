import static org.junit.Assert.*;
import org.junit.Test;

public class QuickUnionTest {

    @Test
    public void test_initially_not_connected() {
        QuickUnion qu = new QuickUnion(10);
        assertFalse(qu.connected(1, 2));
    }

    @Test
    public void test_union_then_connection() {
        QuickUnion qf = new QuickUnion(10);
        qf.union(1, 2);
        assertTrue(qf.connected(1, 2));
    }
}
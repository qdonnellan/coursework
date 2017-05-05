import static org.junit.Assert.*;
import org.junit.Test;

public class QuickFindTest {

	@Test
	public void test_not_connected_by_default() {
		QuickFind qf = new QuickFind(10);
		assertFalse(qf.connected(0, 1));
	}

	@Test
	public void test_union_then_connection() {
		QuickFind qf = new QuickFind(10);
		qf.union(1, 2);
		assertTrue(qf.connected(1, 2));
	}

	@Test
	public void test_multiple_unions() {
		QuickFind qf = new QuickFind(10);
		qf.union(1, 2);
		qf.union(2, 3);
		qf.union(5, 6);
		qf.union(6, 2);
		assertTrue(qf.connected(1, 2));
		assertTrue(qf.connected(1, 6));
		assertTrue(qf.connected(3, 5));
		assertFalse(qf.connected(3, 7));
	}
}
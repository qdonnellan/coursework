public class QuickFindTest {

	public void test() {
		test_union_then_connection();
		test_not_connected_by_default();
		test_multiple_unions();
	}

	private void test_not_connected_by_default() {
		QuickFind qf = new QuickFind(10);
		assert qf.connected(0, 1) == false;
	}

	private void test_union_then_connection() {
		QuickFind qf = new QuickFind(10);
		qf.union(1, 2);
		assert qf.connected(1, 2) == true;
	}

	private void test_multiple_unions() {
		QuickFind qf = new QuickFind(10);
		qf.union(1, 2);
		qf.union(2, 3);
		qf.union(5, 6);
		qf.union(6, 2);
		assert qf.connected(1, 2) == true;
		assert qf.connected(1, 6) == true;
		assert qf.connected(3, 5) == true;
		assert qf.connected(3, 7) == false;
	}

	/** 
	* A very manual test client; run using "java -ea QuickFindTest"
	*/
	public static void main(String[] args) {
		QuickFindTest quickFindTest = new QuickFindTest();
		quickFindTest.test();
	}
}
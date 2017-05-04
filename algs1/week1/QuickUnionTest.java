public class QuickUnionTest {

    public void test() {
        test_initially_not_connected();
        test_union_then_connection();
    }

    public void test_initially_not_connected() {
        QuickUnion qu = new QuickUnion(10);
        assert qu.connected(1, 2) == false;
    }

    private void test_union_then_connection() {
        QuickUnion qf = new QuickUnion(10);
        qf.union(1, 2);
        assert qf.connected(1, 2) == true;
    }


    /* A very manual testing client. Usage: "java -ea QuickUnionTest" */
    public static void main(String[] args) {
        QuickUnionTest qut = new QuickUnionTest();
        qut.test();
    }
}
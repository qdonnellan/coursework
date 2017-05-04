public class ResizingArrayStackOfStringsTest {
	public void test() {
		test_capacity_changes();
	}

	public void test_capacity_changes() {
		// Watch my stack grow in capacity!!!
		ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
		assert stack.isEmpty();
		assert stack.capacity() == 1;
		stack.push("first");
		stack.push("second");
		assert stack.capacity() == 2;
		stack.push("third");
		assert stack.capacity() == 4;
		stack.pop();
		stack.pop();
		assert stack.capacity() == 2;
		stack.pop();
		assert stack.capacity() == 1;
	}

	/* Run using "java -ea ResizingArrayStackOfStringsTest" */
	public static void main(String[] args) {
		ResizingArrayStackOfStringsTest test = new ResizingArrayStackOfStringsTest();
		test.test();
	}
}
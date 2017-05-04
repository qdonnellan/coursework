public class LinkedStackOfStringsTest {
	public void test() {
		test_empty_initially();
		test_non_empty_stack_adter_pushing();
		test_push_then_pop();
		test_multiple_pushes();
	}

	public void test_empty_initially() {
		LinkedStackOfStrings stack = new LinkedStackOfStrings();
		assert stack.isEmpty();
	}

	public void test_non_empty_stack_adter_pushing() {
		LinkedStackOfStrings stack = new LinkedStackOfStrings();
		stack.push("something");
		assert !stack.isEmpty();
	}

	public void test_push_then_pop() {
		LinkedStackOfStrings stack = new LinkedStackOfStrings();
		stack.push("something");
		String result = stack.pop();
		assert result == "something";
		assert stack.isEmpty();
	}

	public void test_multiple_pushes() {
		LinkedStackOfStrings stack = new LinkedStackOfStrings();
		stack.push("first");
		stack.push("second");
		stack.push("third");
		assert stack.pop() == "third";
		assert stack.pop() == "second";
		assert stack.pop() == "first";
		assert stack.isEmpty();
	}

	/* Run using "java -ea LinkedStackOfStringsTest" */
	public static void main(String[] args) {
		LinkedStackOfStringsTest test = new LinkedStackOfStringsTest();
		test.test();
	}
}
public class FixedCapacityStackOfStringsTest {
	public void test() {
		test_empty_initially();
		test_non_empty_stack_adter_pushing();
		test_push_then_pop();
		test_multiple_pushes();
	}

	public void test_empty_initially() {
		FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(10);
		assert stack.isEmpty();
	}

	public void test_non_empty_stack_adter_pushing() {
		FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(10);
		stack.push("something");
		assert !stack.isEmpty();
	}

	public void test_push_then_pop() {
		FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(10);
		stack.push("something");
		String result = stack.pop();
		assert result == "something";
		assert stack.isEmpty();
	}

	public void test_multiple_pushes() {
		FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(10);
		stack.push("first");
		stack.push("second");
		stack.push("third");
		assert stack.pop() == "third";
		assert stack.pop() == "second";
		assert stack.pop() == "first";
		assert stack.isEmpty();
	}

	/* Run using "java -ea FixedCapacityStackOfStringsTest" */
	public static void main(String[] args) {
		FixedCapacityStackOfStringsTest test = new FixedCapacityStackOfStringsTest();
		test.test();
	}
}
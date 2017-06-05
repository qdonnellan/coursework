import static org.junit.Assert.*;
import org.junit.Test;


public class FixedCapacityStackOfStringsTest {

	@Test
	public void test_empty_initially() {
		FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(10);
		assertTrue(stack.isEmpty());
	}

	@Test
	public void test_non_empty_stack_after_pushing() {
		FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(10);
		stack.push("something");
		assertFalse(stack.isEmpty());
	}

	@Test
	public void test_push_then_pop() {
		FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(10);
		stack.push("something");
		String result = stack.pop();
		assertEquals(result, "something");
		assertTrue(stack.isEmpty());
	}

	@Test
	public void test_multiple_pushes() {
		FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(10);
		stack.push("first");
		stack.push("second");
		stack.push("third");
		assertEquals(stack.pop(), "third");
		assertEquals(stack.pop(), "second");
		assertEquals(stack.pop(), "first");
		assertTrue(stack.isEmpty());
	}
}
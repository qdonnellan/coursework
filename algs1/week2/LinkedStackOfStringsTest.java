import static org.junit.Assert.*;
import org.junit.Test;

public class LinkedStackOfStringsTest {

	@Test
	public void test_empty_initially() {
		LinkedStackOfStrings stack = new LinkedStackOfStrings();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void test_non_empty_stack_adter_pushing() {
		LinkedStackOfStrings stack = new LinkedStackOfStrings();
		stack.push("something");
		assertFalse(stack.isEmpty());
	}

	@Test
	public void test_push_then_pop() {
		LinkedStackOfStrings stack = new LinkedStackOfStrings();
		stack.push("something");
		String result = stack.pop();
		assertEquals(result, "something");
		assertTrue(stack.isEmpty());
	}

	@Test
	public void test_multiple_pushes() {
		LinkedStackOfStrings stack = new LinkedStackOfStrings();
		stack.push("first");
		stack.push("second");
		stack.push("third");
		assertEquals(stack.pop(), "third");
		assertEquals(stack.pop(), "second");
		assertEquals(stack.pop(), "first");
		assertTrue(stack.isEmpty());
	}
}
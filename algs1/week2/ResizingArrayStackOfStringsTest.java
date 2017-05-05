import static org.junit.Assert.*;
import org.junit.Test;


public class ResizingArrayStackOfStringsTest {

	@Test
	public void test_capacity_changes() {
		// Watch my stack's capacity grow and shrink!
		ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
		assertTrue(stack.isEmpty());
		assertEquals(stack.capacity(), 1);
		stack.push("first");
		stack.push("second");
		assertEquals(stack.capacity(), 2);
		stack.push("third");
		assertEquals(stack.capacity(), 4);
		stack.pop();
		stack.pop();
		assertEquals(stack.capacity(), 2);
		stack.pop();
		assertEquals(stack.capacity(), 1);
	}
}
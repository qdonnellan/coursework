import static org.junit.Assert.*;
import org.junit.Test;

public class SymbolTableTest {

    @Test
    public void test_simple_put_and_get() {
        SymbolTable<String, String> st = new SymbolTable<String, String>();
        st.put("hello", "world");
        String result = st.get("hello");
        assertEquals("world", "hello");
    }
}
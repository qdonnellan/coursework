import static org.junit.Assert.*;
import org.junit.Test;

public class ClassRosterTest {

    @Test 
    public void test_simple_roster_of_student_names() {
        ClassRoster<String> roster = new ClassRoster<String>();
        roster.push("Steve");
        roster.push("Sally");
        roster.push("Sue");
        for (String name : roster) {
            // Yeah I know this is ugly, but I just really need to make sure 
            // that the iterator is working as expected.
            assertTrue(name == "Steve" || name == "Sally" || name == "Sue");
        }
    }
}
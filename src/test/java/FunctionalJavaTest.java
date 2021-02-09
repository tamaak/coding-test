import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalJavaTest {

    private FunctionalJava functional;

    @Before
    public void setUp() throws Exception {
        functional = new FunctionalJava();
    }

    @Test
    public void testFails() {
        assertEquals(true, false);
    }

    @Test
    public void testPasses() {
        assertEquals(true, true);
    }
}

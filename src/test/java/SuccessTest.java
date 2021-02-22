import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SuccessTest {

    @Test
    public void shouldNeverFail() {
        assertTrue("This should never fail", true);
    }

    @Test
    public void shouldAlsoNeverFail() {
        assertTrue("This should also never fail", true);
    }
}

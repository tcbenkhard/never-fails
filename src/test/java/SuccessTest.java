import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SuccessTest {

    @Test
    public void shouldNeverFail() {
        assertTrue(true, "This should never fail");
    }

    @Test
    public void shouldAlsoNeverFail() {
        assertTrue(true, "This should also never fail");
    }
}

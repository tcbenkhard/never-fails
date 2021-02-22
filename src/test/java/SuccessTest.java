import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

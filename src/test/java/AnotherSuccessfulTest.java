import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnotherSuccessfulTest {

    @Test
    public void willAlwaysSucceed() {
        assertTrue(true, "Very stable test");
    }

    @Test
    public void willAlsoAlwaysSucceed() {
        assertTrue(true, "Cannot possibly fail");
    }
}

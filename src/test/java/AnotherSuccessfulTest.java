import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

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

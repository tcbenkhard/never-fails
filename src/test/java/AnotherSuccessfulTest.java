import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnotherSuccessfulTest {

    @Test
    public void willAlwaysSucceed() {
        assertTrue("Very stable test", true);
    }

    @Test
    public void willAlsoAlwaysSucceed() {
        assertTrue("Cannot possibly fail", true);
    }
}

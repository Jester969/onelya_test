import com.acme.qa.base.UiBaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Custom test runner for debugging purposes, do not include to actual test profiles.
 */
public class CustomTestRunner extends UiBaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger("Debug logger");

    @Test
    public void customTest() {
        LOGGER.info(LOGGER.getClass().getName());
    }
}

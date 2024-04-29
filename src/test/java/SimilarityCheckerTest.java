import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class SimilarityCheckerTest {
    SimilarityChecker checker;

    @BeforeEach
    public void setUp() {
        checker = new SimilarityChecker();
    }

    @Test
    public void throwIllegalArgumentExceptionInvalidInput() {
        assertIllegalArgument(null, null);
    }

    private void assertIllegalArgument(String input1, String input2) {
        try {
            checker.checkLength(input1, input2);
            fail();
        }
        catch (IllegalArgumentException e) {

        }
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class SimilarityCheckerTest {
    @Test
    public void throwIllegalArgumentExceptionInvalidInput() {
        SimilarityChecker checker = new SimilarityChecker();
        String input1 = null;
        String input2 = null;
        try {
            checker.checkLength(null, null);
            fail();
        }
        catch (IllegalArgumentException e) {

        }
    }
}

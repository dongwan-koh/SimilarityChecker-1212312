import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertIllegalArgument("ABC", null);
        assertIllegalArgument(null, "BCD");
    }

    @Test
    public void returnCompareDoubleLength() {
        assertEquals(0, checker.returnLengthScore("A", "BB"));
    }
    @Test
    public void returnCompareSameLength() {
        assertEquals(60, checker.returnLengthScore("ABC","DSA"));
    }
    @Test
    public void returnComparePartialScore1() {
        assertEquals(20, checker.returnLengthScore("AAABB","BAA"));
    }
    @Test
    public void returnComparePartialScore2() {
        assertEquals(30, checker.returnLengthScore("AA","AAE"));
    }

    private void assertIllegalArgument(String input1, String input2) {
        try {
            checker.returnLengthScore(input1, input2);
            fail();
        }
        catch (IllegalArgumentException e) {

        }
    }
}



import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTwoTest {
    @Test
    public void validPins() {
        assertEquals(true, SolutionTwo.validatePin("1234"));
        assertEquals(true, SolutionTwo.validatePin("0000"));
        assertEquals(true, SolutionTwo.validatePin("1111"));
        assertEquals(true, SolutionTwo.validatePin("123456"));
        assertEquals(true, SolutionTwo.validatePin("098765"));
        assertEquals(true, SolutionTwo.validatePin("000000"));
        assertEquals(true, SolutionTwo.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, SolutionTwo.validatePin("a234"));
        assertEquals(false, SolutionTwo.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, SolutionTwo.validatePin("1"));
        assertEquals(false, SolutionTwo.validatePin("12"));
        assertEquals(false, SolutionTwo.validatePin("123"));
        assertEquals(false, SolutionTwo.validatePin("12345"));
        assertEquals(false, SolutionTwo.validatePin("1234567"));
        assertEquals(false, SolutionTwo.validatePin("-1234"));
        assertEquals(false, SolutionTwo.validatePin("1.234"));
        assertEquals(false, SolutionTwo.validatePin("00000000"));
    }
}
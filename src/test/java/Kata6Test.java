import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class Kata6Test {
    @Test
    public void tests() {
        assertEquals(true, Kata6.validPhoneNumber("(123) 456-7890"));
        assertEquals(false, Kata6.validPhoneNumber("(1111)555 2345"));
        assertEquals(false, Kata6.validPhoneNumber("(098) 123 4567"));
    }
}
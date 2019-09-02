

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DRootTest{
    @Test
    public void Tests() {
        assertEquals( 7, Persist.persistence(16));
        assertEquals( 6, Persist.persistence(456), "great");
        assertEquals(6, Persist.persistence(25912941), "Good job bro!");
    }
}
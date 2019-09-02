
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void test1(){
        assertEquals(1, TripleDouble.TripleDouble(451999277L, 41177722899L));
    }

    @Test
    public void test2(){
        assertEquals(0, TripleDouble.TripleDouble(1222345L, 12345L));
    }

    @Test
    public void test3(){
        assertEquals(0, TripleDouble.TripleDouble(12345L, 12345L));
    }

    @Test
    public void test4(){
        assertEquals(1, TripleDouble.TripleDouble(666789L, 666789L));
    }

    @Test
    public void test5() {
        assertEquals(0, TripleDouble.TripleDouble(451999277L, 411777228L));
    }

    @Test
    public void test6() {
        assertEquals(0, TripleDouble.TripleDouble(1112L, 122L));
    }
}
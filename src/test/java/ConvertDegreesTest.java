
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ConvertDegreesTest {
    private ConvertDegrees degrees;
    @BeforeEach
    void setUp() {
        degrees = new ConvertDegrees(); // ctrl+alt+f - utworzenie zmiennej globalnej
    }
    @Test
    void shouldConvertCelciusDegreesToFarenheit() {
        //when
        double result = degrees.celsiusToFahrenheit(12.0);
        //then
        assertEquals(53.6, result);
    }
    @Test
    void shouldConvertFahrenheitToCelcius() {
        //when
        double result = degrees.FahrenheitToCelcius(35.0);
        //then
        assertEquals(1.61, result, 2);
    }
}

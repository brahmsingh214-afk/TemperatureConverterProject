import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {

        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.001);

    }
    @Test
    void testFahrenheitToCelsius() {

        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 0.001);

    }
    @Test
    void testCelsiusToKelvin() {
        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(273.15, converter.celsiusToKelvin(0.0), 0.001);
    }
}
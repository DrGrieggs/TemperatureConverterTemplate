import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    private static final double DELTA = 0.001; // Tolerance for floating point comparisons
    private TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testWaterFreezingPoint() {
        assertEquals(0.0, converter.toCelsius(32.0), DELTA);
        assertEquals(32.0, converter.toFahrenheit(0.0), DELTA);
    }

    @Test
    public void testWaterBoilingPoint() {
        assertEquals(100.0, converter.toCelsius(212.0), DELTA);
        assertEquals(212.0, converter.toFahrenheit(100.0), DELTA);
    }

    @Test
    public void testBodyTemperature() {
        assertEquals(37.0, converter.toCelsius(98.6), DELTA);
        assertEquals(98.6, converter.toFahrenheit(37.0), DELTA);
    }

    @Test
    public void testArbitraryTemperatures() {
        assertEquals(25.0, converter.toCelsius(77.0), DELTA);
        assertEquals(77.0, converter.toFahrenheit(25.0), DELTA);
        assertEquals(-40.0, converter.toCelsius(-40.0), DELTA);
        assertEquals(-40.0, converter.toFahrenheit(-40.0), DELTA);
    }

    @Test
    public void testRoundTrip() {
        double initialF = 98.6;
        double celsiusValue = converter.toCelsius(initialF);
        double backToF = converter.toFahrenheit(celsiusValue);
        assertEquals(initialF, backToF, DELTA);
    }
}
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class MeasurementTest {
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void add_gives_the_sum_of_two_measurements() throws Exception {
        Measurement measurement1 = Measurement.newInstance(2);
        Measurement measurement2 = Measurement.newInstance(1);
        Measurement expectedMeasurement = Measurement.newInstance(3);
        Measurement actualMeasurement = measurement1.add(measurement2);
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void multiply_gives_the_product_of_two_measurements() throws Exception {
        Measurement measurement1 = Measurement.newInstance(2);
        Measurement measurement2 = Measurement.newInstance(1);
        Measurement expectedMeasurement = Measurement.newInstance(2);
        Measurement actualMeasurement = measurement1.multiply(measurement2);
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void measurement_throws_exception_when_the_given_value_is_invalid() throws Exception {
        thrown.expect(NegativeValueException.class);
        thrown.expectMessage("Expected positive value got -2.0");
        Measurement.newInstance(-2);
    }
}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeasurementTest {
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

    @Test(expected = RuntimeException.class)
    public void measurement_throws_exception_when_the_given_value_is_invalid() throws Exception {
        Measurement measurement = Measurement.newInstance(-2);
    }
}
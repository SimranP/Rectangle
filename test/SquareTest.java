import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void area_of_square_is_0_when_given_side_is_0() throws Exception {
        Sqaure sqaure = new Sqaure(Measurement.newInstance(0));
        Assert.assertEquals(Measurement.newInstance(0),sqaure.calculateArea());
    }

    @Test
    public void area_of_square_is_a_positive_number_when_given_side_is_a_positive_non_zero_number() throws Exception {
        Sqaure sqaure = new Sqaure(Measurement.newInstance(8));
        Assert.assertEquals(Measurement.newInstance(64),sqaure.calculateArea());
    }

    @Test
    public void perimeter_of_square_is_0_when_given_side_is_0() throws Exception {
        Sqaure sqaure = new Sqaure(Measurement.newInstance(0));
        Assert.assertEquals(Measurement.newInstance(0),sqaure.calculatePerimeter());
    }

    @Test
    public void perimeter_of_square_is_a_positive_number_when_given_side_is_a_positive_non_zero_number() throws Exception {
        Sqaure sqaure = new Sqaure(Measurement.newInstance(4));
        Assert.assertEquals(Measurement.newInstance(16),sqaure.calculatePerimeter());
    }

}

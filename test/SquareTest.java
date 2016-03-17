import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void area_of_square_is_0_when_given_side_is_0() throws Exception {
        Square square = new Square(Measurement.newInstance(0));
        Assert.assertEquals(Measurement.newInstance(0),square.calculateArea());
    }

    @Test
    public void area_of_square_is_a_positive_number_when_given_side_is_a_positive_non_zero_number() throws Exception {
        Square square = new Square(Measurement.newInstance(8));
        Assert.assertEquals(Measurement.newInstance(64),square.calculateArea());
    }

    @Test
    public void perimeter_of_square_is_0_when_given_side_is_0() throws Exception {
        Square square = new Square(Measurement.newInstance(0));
        Assert.assertEquals(Measurement.newInstance(0),square.calculatePerimeter());
    }

    @Test
    public void perimeter_of_square_is_a_positive_number_when_given_side_is_a_positive_non_zero_number() throws Exception {
        Square square = new Square(Measurement.newInstance(4));
        Assert.assertEquals(Measurement.newInstance(16),square.calculatePerimeter());
    }

}

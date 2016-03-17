import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void rectangle_should_be_able_to_tell_its_area_when_height_and_weight_is_0() throws Exception {
        Rectangle rectangle = new Rectangle(Measurement.newInstance(0),Measurement.newInstance(0));
        Assert.assertEquals(Measurement.newInstance(0),rectangle.calculateArea());
    }

    @Test
    public void rectangle_should_be_able_to_tell_its_area_when_height_and_width_are_floating_point_numbers() throws Exception {
        Rectangle rectangle = new Rectangle(Measurement.newInstance(2.5),Measurement.newInstance(2));
        Assert.assertEquals(Measurement.newInstance(5),rectangle.calculateArea());
    }

    @Test
    public void rectangle_should_be_able_to_tell_its_area_when_height_and_width_are_non_zero_positive_numbers() throws Exception {
        Rectangle rectangle = new Rectangle(Measurement.newInstance(7),Measurement.newInstance(8));
        Assert.assertEquals(Measurement.newInstance(56),rectangle.calculateArea());
    }

    @Test
    public void rectangle_should_be_able_to_tell_its_perimeter_when_height_and_width_are_non_zero_positive_numbers() throws Exception {
        Rectangle rectangle = new Rectangle(Measurement.newInstance(1),Measurement.newInstance(1));
        Assert.assertEquals(Measurement.newInstance(4),rectangle.calculatePerimeter());
    }
}

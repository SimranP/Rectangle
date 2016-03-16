import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void rectangle_should_be_able_to_tell_its_area_when_height_and_weight_is_0() throws Exception {
        Rectangle rectangle = new Rectangle(0,0);
        Assert.assertEquals(0,rectangle.area());
    }

    @Test
    public void rectangle_should_be_able_to_tell_its_area_when_height_and_width_are_same_non_zero_positive_numbers() throws Exception {
        Rectangle rectangle = new Rectangle(1,1);
        Assert.assertEquals(1,rectangle.area());
    }

    @Test
    public void rectangle_should_be_able_to_tell_its_area_when_height_and_width_are_non_zero_positive_numbers() throws Exception {
        Rectangle rectangle = new Rectangle(7,8);
        Assert.assertEquals(56,rectangle.area());
    }

    @Test
    public void rectangle_should_be_able_to_tell_its_perimeter_when_height_and_width_are_non_zero_positive_numbers() throws Exception {
        Rectangle rectangle = new Rectangle(1,1);
        Assert.assertEquals(4,rectangle.perimeter());
    }
}

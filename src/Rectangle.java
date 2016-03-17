/*
  Job of Rectangle ---
    # To calculate the associative properties of rectangle
*/

public class Rectangle implements Shapes {
    private final Measurement height;
    private final Measurement width;

    public Rectangle(Measurement height, Measurement width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Measurement calculateArea() {
        return width.multiply(height);
    }

    @Override
    public Measurement calculatePerimeter() {
        return Measurement.newInstance(2).multiply(width.add(height));
    }
}

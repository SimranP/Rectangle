/*
  Job of Rectangle ---
    # To calculate the associative properties of rectangle
*/

public class Rectangle{
    private final Measurement height;
    private final Measurement width;

    public Rectangle(Measurement height, Measurement width) {
        this.height = height;
        this.width = width;
    }

    public Measurement calculateArea() {
        return width.multiply(height);
    }

    public Measurement calculatePerimeter() {
        return Measurement.newInstance(2).multiply(width.add(height));
    }
}

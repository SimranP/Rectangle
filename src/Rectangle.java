public class Rectangle {
    private final Measurement height;
    private final Measurement width;

    public Rectangle(Measurement height, Measurement width) {
        this.height = height;
        this.width = width;
    }

    public int area() {
        return width.multiply(height);
    }

    public int perimeter() {
        return 2 * (width.add(height));
    }
}

public class Sqaure implements  Shapes{
    private Measurement side;

    public Sqaure(Measurement side){
        this.side = side;
    }

    @Override
    public Measurement calculateArea() {
        return side.multiply(side);
    }

    @Override
    public Measurement calculatePerimeter() {
        return side.multiply(Measurement.newInstance(4));
    }
}

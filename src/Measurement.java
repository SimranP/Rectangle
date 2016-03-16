public class Measurement {
    private double number;

    public static Measurement newInstance(double number) {
        if (number >= 0)
            return new Measurement(number);
        throw new RuntimeException("Measurement can't be " + number);
    }

    private Measurement(double number) {
        this.number = number;
    }

    public Measurement add(Measurement anotherMeasurement) {
        return new Measurement(number + anotherMeasurement.number);
    }

    public Measurement multiply(Measurement anotherMeasurement) {
        return new Measurement(number * anotherMeasurement.number);
    }

    public double value() {
        return number;
    }
}

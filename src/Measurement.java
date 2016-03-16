public class Measurement {
    private int number;

    public Measurement(int number) {
        this.number = number;
    }

    public int add(Measurement anotherMeasurement) {
        return number+anotherMeasurement.number;
    }

    public int multiply(Measurement anotherMeasurement) {
        return number*anotherMeasurement.number;
    }
}

/*
   Job of Measurement -----
        # To answer the calculations between two measurements .
*/

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;

        return Double.compare(that.number, number) == 0;

    }

}

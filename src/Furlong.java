public class Furlong extends Length {
    private static final int INCHES_IN_A_FURLONG = 7920;

    public Furlong(double value) {
        super(value);
    }

    protected double toInch() {
        return value * INCHES_IN_A_FURLONG;
    }
}

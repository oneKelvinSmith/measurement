public class Mile extends Length {
    private static final int INCHES_IN_A_MILE = 63360;

    public Mile(double value) {
        super(value);
    }

    protected double toInch() {
        return value * INCHES_IN_A_MILE;
    }
}

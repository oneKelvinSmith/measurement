public class Cable extends Length {

    public static final int INCHES_IN_A_CABLE = 8640;

    public Cable(float value) {
        super(value);
    }

    protected double toInch() {
        return value * INCHES_IN_A_CABLE;
    }
}
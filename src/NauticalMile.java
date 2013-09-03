public class NauticalMile extends Length{
    public static final int INCHES_IN_A_NAUTICAL_MILE = 86400;

    public NauticalMile(double value) {
        super(value);
    }

    protected double toInch() {
        return value * INCHES_IN_A_NAUTICAL_MILE;
    }
}

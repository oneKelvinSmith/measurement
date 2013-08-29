public class Foot extends Length {

    public static final int INCHES_IN_A_FOOT = 12;

    public Foot(float value) {
        super(value);
    }

    protected float toInch() {
        return value * INCHES_IN_A_FOOT;
    }
}
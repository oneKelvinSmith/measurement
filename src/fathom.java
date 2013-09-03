public class Fathom extends Length{
    public static final int INCHES_IN_A_FATHOM = 72;

    public Fathom(double value) {
        super(value);
    }

    protected double toInch() {
        return value * INCHES_IN_A_FATHOM;
    }
}

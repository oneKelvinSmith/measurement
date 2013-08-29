// understands length in yards
public class Yard extends Length {

    public static final int INCHES_IN_A_YARD = 36;

    public Yard(float value) {
        super(value);
    }

    protected float toInch() {
        return value * INCHES_IN_A_YARD;
    }
}

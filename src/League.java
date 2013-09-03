public class League extends Length {
    public static final int INCHES_IN_A_LEAGUE = 190080;

    public League(double value) {
        super(value);
    }

    protected double toInch() {
        return value * INCHES_IN_A_LEAGUE;
    }
}

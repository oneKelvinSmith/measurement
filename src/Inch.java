public class Inch extends Length {
    public Inch(double value) {
        super(value);
    }

    @Override
    protected double toInch() {
        return value;
    }
}

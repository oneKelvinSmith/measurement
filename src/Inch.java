public class Inch extends Length {
    public Inch(float value) {
        super(value);
    }

    @Override
    protected float toInch() {
        return value;
    }
}

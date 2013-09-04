//understands length as a unit of measure for distance
public class Length {
    private final double quantity;
    private final LengthUnit unit;

    public Length(double quantity, LengthUnit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Length))
            return false;
        Length anotherLength = (Length) other;
        return unit.convertToBase(quantity)
                == anotherLength.unit.convertToBase(anotherLength.quantity);
    }

    @Override
    public int hashCode() {
        return new Double(quantity).hashCode();
    }

}

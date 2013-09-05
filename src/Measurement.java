// understands measurement of length and volume
public class Measurement {
    private final double quantity;
    private final Unit unit;

    public Measurement(double quantity, Unit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public Measurement add(Measurement other) throws IncompatibleUnitsException {
        if (hasDifferentBaseUnit(other))
            throw new IncompatibleUnitsException();

        double addedQuantityInBaseUnit = unit.quantityInBaseUnit(quantity) + other.unit.quantityInBaseUnit(other.quantity);
        return new Measurement(addedQuantityInBaseUnit, unit.getBaseUnit());
    }

    private boolean hasDifferentBaseUnit(Measurement other) {
        return !other.unit.isSameMeasurementTypeAs(unit);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Measurement))
            return false;
        Measurement another = (Measurement) other;
        if (hasDifferentBaseUnit(another))
            return false;
        return unit.quantityInBaseUnit(quantity)
                == another.unit.quantityInBaseUnit(another.quantity);
    }

    @Override
    public int hashCode() {
        return new Double(unit.quantityInBaseUnit(quantity)).hashCode() * unit.name().hashCode();
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "quantity=" + quantity +
                ", unit=" + unit +
                '}';
    }
}

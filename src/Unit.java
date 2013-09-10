public enum Unit {
    INCH(1, "INCH"),
    FOOT(12 * INCH.quantityInBaseUnit, "INCH"),
    YARD(3 * FOOT.quantityInBaseUnit, "INCH"),
    FURLONG(7920, "INCH"),
    MILE(63360, "INCH"),
    LEAGUE(190080, "INCH"),
    FATHOM(22238.208, "INCH"),
    CABLE(2223820.8, "INCH"),
    NAUTICAL_MILE(22238208, "INCH"),
    TEASPOON(1, "TEASPOON"),
    TABLESPOON(3, "TEASPOON"),
    OUNCE(6, "TEASPOON"),
    CUP(48, "TEASPOON");

    private final double quantityInBaseUnit;
    private final String baseUnit;

    Unit(double quantityInBaseUnit, String baseUnit) {
        this.quantityInBaseUnit = quantityInBaseUnit;
        this.baseUnit = baseUnit;
    }

    public Unit baseUnit() {
        return valueOf(baseUnit);
    }

    public double quantityInBaseUnit(double quantity) {
        return quantity * quantityInBaseUnit;
    }

    public boolean isSameMeasurementTypeAs(Unit anotherUnit) {
        return this.baseUnit.equals(anotherUnit.baseUnit);
    }
}
public enum Unit {
    INCH,
    FOOT(12, INCH),
    YARD(36, INCH),
    FURLONG(7920, INCH),
    MILE(63360, INCH),
    LEAGUE(190080, INCH),
    FATHOM(22238.208, INCH),
    CABLE(2223820.8, INCH),
    NAUTICAL_MILE(22238208, INCH),
    TEASPOON,
    TABLESPOON(3, TEASPOON),
    OUNCE(6, TEASPOON),
    CUP(48, TEASPOON);

    private double quantityInBaseUnit;
    private Unit baseUnit;
    private static final int SMALLEST_UNIT = 1;

    Unit() {
        quantityInBaseUnit = SMALLEST_UNIT;
        baseUnit = this;
    }

    Unit(double quantityInBaseUnit, Unit baseUnit) {
        this.quantityInBaseUnit = quantityInBaseUnit;
        this.baseUnit = baseUnit;
    }

    public Unit getBaseUnit() {
        return baseUnit;
    }

    public double quantityInBaseUnit(double quantity) {
        return quantity * quantityInBaseUnit;
    }

    public boolean isSameMeasurementTypeAs(Unit anotherUnit) {
        return this.baseUnit == anotherUnit.baseUnit;
    }
}
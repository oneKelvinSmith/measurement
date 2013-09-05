public enum VolumeUnit {
    TEASPOON(1),
    TABLESPOON(3);

    private double base;

    VolumeUnit(double base) {
        this.base = base;
    }

    public double convertToBase(double quantity) {
        return base * quantity;
    }
}

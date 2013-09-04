public enum LengthUnit {
    INCH(1),
    FOOT(12),
    YARD(36),
    FATHOM(72),
    FURLONG(7920),
    CABLE(8640),
    MILE(63360),
    NAUTICAL_MILE(86400),
    LEAGUE(190080);

    private int value;

    private LengthUnit(int value) {
        value = value;
    }


}

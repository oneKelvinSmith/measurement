public abstract class Length {

    protected final double value;

    public Length(double value) {
        this.value = value;
    }

    protected abstract double toInch();

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Length))
            return false;

        return this.toInch() == ((Length) object).toInch();
    }

    @Override
    public int hashCode() {
        return new Double(this.toInch()).hashCode();
    }
}
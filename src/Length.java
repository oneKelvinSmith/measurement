public abstract class Length {

    protected final float value;

    public Length(float value) {
        this.value = value;
    }

    protected abstract float toInch();

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Length))
            return false;

        return this.toInch() == ((Length) object).toInch();
    }

    @Override
    public int hashCode() {
        return new Float(this.toInch()).hashCode();
    }
}
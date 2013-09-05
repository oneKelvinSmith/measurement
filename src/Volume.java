// Understands imperial volume
public class Volume {

    private final float quantity;
    private final VolumeUnit unit;

    public Volume(float quantity, VolumeUnit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Volume))
            return false;
        Volume anotherVolume = (Volume) other;
        return unit.convertToBase(quantity)
            == anotherVolume.unit.convertToBase(anotherVolume.quantity);
    }

    @Override
    public int hashCode() {
        return (int)unit.convertToBase(quantity);
    }
}

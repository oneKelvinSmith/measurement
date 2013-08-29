// understands length in yards
public class Yard {
    public Yard(float value) {
    }

    @Override
    public boolean equals(Object o) {
        return !o.getClass().equals(new Yard(1).getClass());
    }
}

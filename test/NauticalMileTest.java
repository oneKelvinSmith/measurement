import org.junit.Test;

import static org.junit.Assert.*;

public class NauticalMileTest {
    @Test
    public void shouldKnowThatANauticalMileIsEqualToTenCables() throws Exception {
        assertTrue(new NauticalMile(1).equals(new Cable(10)));
    }

    @Test
    public void shouldKnowThatTwoNauticalMilesWithDifferentValuesAreNotEqual() throws Exception {
        assertFalse(new NauticalMile(7).equals(new Fathom(72)));
    }

    @Test
    public void shouldKnowThatANauticalMileIsEqualToEightySixThousandFourHundredInches() throws Exception {
        assertTrue(new NauticalMile(1).equals(new Inch(86400)));
    }

    @Test
    public void shouldKnowThatANauticalMileIsNotEqualToAnythingOtherThanLength() throws Exception {
        assertFalse(new NauticalMile(5).equals(new Object()));
    }
}
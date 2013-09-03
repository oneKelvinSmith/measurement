import org.junit.Test;

import static org.junit.Assert.*;

public class FathomTest {
    @Test
    public void shouldKnowThatAFathomIsEqualToSixFeet() throws Exception {
        assertTrue(new Fathom(1).equals(new Foot(6)));
    }

    @Test
    public void shouldKnowThatTwoFathomsWithDifferentValuesAreNotEqual() throws Exception {
        assertFalse(new Fathom(7).equals(new Fathom(72)));
    }

    @Test
    public void shouldKnowThatAFathomIsEqualToSeventyTwoInches() throws Exception {
        assertTrue(new Fathom(1).equals(new Inch(72)));
    }

    @Test
    public void shouldKnowThatAFathomIsNotEqualToAnythingOtherThanLength() throws Exception {
        assertFalse(new Fathom(5).equals(new Object()));
    }
}
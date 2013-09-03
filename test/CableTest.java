import org.junit.Test;

import static org.junit.Assert.*;

public class CableTest {
    @Test
    public void shouldKnowThatACableIsEqualToOneHundredAndTwentyFathoms() throws Exception {
        assertTrue(new Cable(1).equals(new Fathom(120)));
    }

    @Test
    public void shouldKnowThatTwoCablesWithDifferentValuesAreNotEqual() throws Exception {
        assertFalse(new Cable(3).equals(new Cable(21)));
    }

    @Test
    public void shouldKnowThatOneCableIsEqualToEightThousandSixHundredAndFortyInches() throws Exception {
        assertTrue(new Cable(1).equals(new Inch(8640)));
    }

    @Test
    public void shouldKnowThatACableIsNotEqualToAnythingOtherThanLength() throws Exception {
        assertFalse(new Cable(5).equals(new Object()));
    }
}
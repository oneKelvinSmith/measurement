import org.junit.Test;

import static org.junit.Assert.*;

public class YardTest {
    @Test
    public void shouldKnowThatAYardIsEqualToThreeFeet() throws Exception {
        assertTrue(new Yard(1).equals(new Foot(3)));
    }

    @Test
    public void shouldKnowThatTwoYardsWithDifferentValuesAreNotEqual() throws Exception {
        assertFalse(new Yard(3).equals(new Yard(2)));
    }

    @Test
    public void shouldKnowThatTwoYardsAreEqualToSeventyTwoInches() throws Exception {
        assertTrue(new Yard(2).equals(new Inch(72)));
    }

    @Test
    public void shouldKnowThatAYardIsNotEqualToAnythingOtherThanLength() throws Exception {
        assertFalse(new Yard(5).equals(new Object()));
    }
}
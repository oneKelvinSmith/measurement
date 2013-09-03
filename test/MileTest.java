import org.junit.Test;

import static org.junit.Assert.*;

public class MileTest {

    @Test
    public void shouldKnowThatOneMileIsEqualToFiveThousandAndEightyFeet() throws Exception {
        assertTrue(new Mile(1).equals(new Foot(5280)));
    }

    @Test
    public void shouldKnowThatAMileIsEqualToSixtyThreeThousandThreeHundredAndSixtyInches() throws Exception {
        assertTrue(new Mile(1).equals(new Inch(63360)));
    }

    @Test
    public void shouldKnowThatTwoMilesWithDifferentValuesAreNotEqual() throws Exception {
        assertFalse(new Mile(3).equals(new Mile(21)));
    }
    @Test
    public void shouldKnowThatAMileIsNotEqualToAnythingOtherThanLength() throws Exception {
        assertFalse(new Mile(5).equals(new Object()));
    }
}
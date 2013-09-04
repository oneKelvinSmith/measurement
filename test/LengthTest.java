import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LengthTest {

    @Test
    public void shouldKnowThatOneFootIsEqualToTwelveInches() {
        assertTrue(new Length(1, LengthUnit.FOOT).equals(new Length(12, LengthUnit.INCH)));
    }

    @Test
    public void shouldKnowThatOneFootIsNotEqualOneInch() {
        assertFalse(new Length(1, LengthUnit.FOOT).equals(new Length(1, LengthUnit.INCH)));
    }

    @Test
    public void shouldKnowThatTwoLengthsInInchMayBeEqual() {
        assertTrue(new Length(1, LengthUnit.INCH).equals(new Length(1, LengthUnit.INCH)));
    }

    @Test
    public void shouldKnowThatTwoLengthsInFootMayBeEqual() {
        assertTrue(new Length(1, LengthUnit.FOOT).equals(new Length(1, LengthUnit.FOOT)));
    }

    @Test
    public void shouldKnowThatLengthAndNullAreNotEqual() throws Exception {
        assertFalse(new Length(1, LengthUnit.INCH).equals(null));
    }

    @Test
    public void shouldKnowThatLengthAndObjectAreNotEqual() throws Exception {
        assertFalse(new Length(1, LengthUnit.FOOT).equals(new Object()));
    }

    @Test
    public void shouldKnowThatALengthInFootMayNotBeEqualToALengthInYard() throws Exception {
        assertFalse(new Length(1, LengthUnit.FOOT).equals(new Length(1, LengthUnit.YARD)));
    }

    @Test
    public void shouldKnowThatALengthFootMayBeEqualToALengthInYard() throws Exception {
        assertTrue(new Length(3, LengthUnit.FOOT).equals(new Length(1, LengthUnit.YARD)));
    }

    @Test
    public void shouldKnowThatALengthYardMayBeEqualToALengthInInches() throws Exception {
        assertTrue(new Length(1, LengthUnit.YARD).equals(new Length(36, LengthUnit.INCH)));
    }

    @Test
    public void shouldKnowThatALengthInFurlongMayBeEqualToALengthInFeet() throws Exception {
        assertTrue(new Length(1, LengthUnit.FURLONG).equals(new Length(660, LengthUnit.FOOT)));
    }

    @Test
    public void shouldKnowThatALengthInInchesMayBeEqualToALengthInFurlongs() throws Exception {
        assertTrue(new Length(7920, LengthUnit.INCH).equals(new Length(1, LengthUnit.FURLONG)));
    }

    @Test
    public void shouldKnowThatALengthInYardsMayBeEqualToALengthInFurlongs() throws Exception {
        assertTrue(new Length(220, LengthUnit.YARD).equals(new Length(1, LengthUnit.FURLONG)));
    }

    @Test
    public void shouldKnowThatALengthInMilesMayBeEqualToALengthInInches() throws Exception {
        assertTrue(new Length(1, LengthUnit.MILE).equals(new Length(63360, LengthUnit.INCH)));
    }

    @Test
    public void shouldKnowThatALengthInFeetMayBeEqualToALengthInMiles() throws Exception {
        assertTrue(new Length(5280, LengthUnit.FOOT).equals(new Length(1, LengthUnit.MILE)));
    }

    @Test
    public void shouldKnowThatALengthInMilesMayBeEqualToALengthInLeagues() throws Exception {
        assertTrue(new Length(3, LengthUnit.MILE).equals(new Length(1, LengthUnit.LEAGUE)));
    }

    @Test
    public void shouldKnowThatALengthInInchesMayBeEqualToALengthInLeagues() throws Exception {
        assertTrue(new Length(190080, LengthUnit.INCH).equals(new Length(1, LengthUnit.LEAGUE)));
    }

    @Test
    public void shouldKnowThatALengthInInchesMayBeEqualToALengthInFathoms() throws Exception {
        assertTrue(new Length(22238.208, LengthUnit.INCH).equals(new Length(1, LengthUnit.FATHOM)));
    }

    @Test
    public void shouldKnowOneCableIsOneHundredFathoms() throws Exception {
        assertTrue(new Length(1, LengthUnit.CABLE).equals(new Length(100, LengthUnit.FATHOM)));
    }

    @Test
    public void shouldKnowThatALengthInNauticalMileMayBeEqualToALengthInCable() throws Exception {
        assertTrue(new Length(1, LengthUnit.NAUTICAL_MILE).equals(new Length(10, LengthUnit.CABLE)));
    }
}

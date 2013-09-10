import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementTest {

    @Test
    public void shouldKnowThatOneFootIsEqualToTwelveInches() {
        assertTrue(new Measurement(1, Unit.FOOT).equals(new Measurement(12, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatOneFootIsNotEqualOneInch() {
        assertFalse(new Measurement(1, Unit.FOOT).equals(new Measurement(1, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatTwoLengthsInInchMayBeEqual() {
        assertTrue(new Measurement(1, Unit.INCH).equals(new Measurement(1, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatTwoLengthsInFootMayBeEqual() {
        assertTrue(new Measurement(1, Unit.FOOT).equals(new Measurement(1, Unit.FOOT)));
    }

    @Test
    public void shouldKnowThatLengthAndNullAreNotEqual() throws Exception {
        assertFalse(new Measurement(1, Unit.INCH).equals(null));
    }

    @Test
    public void shouldKnowThatLengthAndObjectAreNotEqual() throws Exception {
        assertFalse(new Measurement(1, Unit.FOOT).equals(new Object()));
    }

    @Test
    public void shouldKnowThatALengthInFootMayNotBeEqualToALengthInYard() throws Exception {
        assertFalse(new Measurement(1, Unit.FOOT).equals(new Measurement(1, Unit.YARD)));
    }

    @Test
    public void shouldKnowThatALengthFootMayBeEqualToALengthInYard() throws Exception {
        assertTrue(new Measurement(3, Unit.FOOT).equals(new Measurement(1, Unit.YARD)));
    }

    @Test
    public void shouldKnowThatALengthYardMayBeEqualToALengthInInches() throws Exception {
        assertTrue(new Measurement(1, Unit.YARD).equals(new Measurement(36, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatALengthInFurlongMayBeEqualToALengthInFeet() throws Exception {
        assertTrue(new Measurement(1, Unit.FURLONG).equals(new Measurement(660, Unit.FOOT)));
    }

    @Test
    public void shouldKnowThatALengthInInchesMayBeEqualToALengthInFurlongs() throws Exception {
        assertTrue(new Measurement(7920, Unit.INCH).equals(new Measurement(1, Unit.FURLONG)));
    }

    @Test
    public void shouldKnowThatALengthInYardsMayBeEqualToALengthInFurlongs() throws Exception {
        assertTrue(new Measurement(220, Unit.YARD).equals(new Measurement(1, Unit.FURLONG)));
    }

    @Test
    public void shouldKnowThatALengthInMilesMayBeEqualToALengthInInches() throws Exception {
        assertTrue(new Measurement(1, Unit.MILE).equals(new Measurement(63360, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatALengthInFeetMayBeEqualToALengthInMiles() throws Exception {
        assertTrue(new Measurement(5280, Unit.FOOT).equals(new Measurement(1, Unit.MILE)));
    }

    @Test
    public void shouldKnowThatALengthInMilesMayBeEqualToALengthInLeagues() throws Exception {
        assertTrue(new Measurement(3, Unit.MILE).equals(new Measurement(1, Unit.LEAGUE)));
    }

    @Test
    public void shouldKnowThatALengthInInchesMayBeEqualToALengthInLeagues() throws Exception {
        assertTrue(new Measurement(190080, Unit.INCH).equals(new Measurement(1, Unit.LEAGUE)));
    }

    @Test
    public void shouldKnowThatALengthInInchesMayBeEqualToALengthInFathoms() throws Exception {
        assertTrue(new Measurement(22238.208, Unit.INCH).equals(new Measurement(1, Unit.FATHOM)));
    }

    @Test
    public void shouldKnowThatALengthInCableMayBeEqualToALengthInFathoms() throws Exception {
        assertTrue(new Measurement(1, Unit.CABLE).equals(new Measurement(100, Unit.FATHOM)));
    }

    @Test
    public void shouldKnowThatALengthInNauticalMileMayBeEqualToALengthInCable() throws Exception {
        assertTrue(new Measurement(1, Unit.NAUTICAL_MILE).equals(new Measurement(10, Unit.CABLE)));
    }

    @Test
    public void shouldKnowThatATablespoonMayEqualTeaspoons() throws Exception {
        assertTrue(new Measurement(1, Unit.TABLESPOON).equals(new Measurement(3, Unit.TEASPOON)));
    }

    @Test
    public void shouldKnowThatAnOunceMayEqualTableSpoons() throws Exception {
        assertTrue(new Measurement(1, Unit.OUNCE).equals(new Measurement(2, Unit.TABLESPOON)));
    }

    @Test
    public void shouldKnowThatOuncesMayEqualCup() throws Exception {
        assertTrue(new Measurement(8, Unit.OUNCE).equals(new Measurement(1, Unit.CUP)));
    }

    @Test
    public void shouldKnowThatTeaspoonMayNotEqualInches() throws Exception {
        assertFalse(new Measurement(1, Unit.TEASPOON).equals(new Measurement(1, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatInchMayNotEqualTeaspoon() throws Exception {
        assertFalse(new Measurement(1, Unit.INCH).equals(new Measurement(1, Unit.TEASPOON)));
    }

    @Test
    public void shouldKnowThatACupMayNotBeEqualToFeet() throws Exception {
        assertFalse(new Measurement(4, Unit.FOOT).equals(new Measurement(1, Unit.CUP)));
    }

    @Test
    public void shouldKnowHowToAddTeaspoons() throws Exception {
        assertEquals(new Measurement(1, Unit.TEASPOON).add(new Measurement(2, Unit.TEASPOON)), new Measurement(3, Unit.TEASPOON));
    }

    @Test(expected = IncompatibleUnitsException.class)
    public void shouldKnowYouCannotAddTeaspoonsAndInch() throws Exception {
        new Measurement(1, Unit.TEASPOON).add(new Measurement(1, Unit.INCH));
    }

    @Test(expected = IncompatibleUnitsException.class)
    public void shouldKnowYouCannotAddFeetAndTablespoons() throws Exception {
        new Measurement(1, Unit.FOOT).add(new Measurement(1, Unit.TABLESPOON));
    }

    @Test(expected = IncompatibleUnitsException.class)
    public void shouldKnowYouCannotAddAInchAndTeaspoons() throws Exception {
        new Measurement(1, Unit.INCH).add(new Measurement(1, Unit.TEASPOON));
    }

    @Test
    public void shouldKnowHowToAddFeet() throws Exception {
        assertEquals(new Measurement(1, Unit.FOOT).add(new Measurement(2, Unit.FOOT)), new Measurement(3, Unit.FOOT));
    }

    @Test
    public void shouldKnowHowToAddInchAndFoot() throws Exception {
        assertEquals(new Measurement(1, Unit.INCH).add(new Measurement(1, Unit.FOOT)), new Measurement(13, Unit.INCH));
    }

    @Test
    public void shouldKnowATeaSpoonAndAnInchHasDifferentHashCode() throws Exception {
        assertNotEquals(new Measurement(1, Unit.INCH).hashCode(), new Measurement(1, Unit.TEASPOON).hashCode());
    }

    @Test
    public void shouldHaveTheSameHashCode() throws Exception {
        assertEquals(new Measurement(1, Unit.FOOT).hashCode(), new Measurement(12, Unit.INCH).hashCode());
    }
}

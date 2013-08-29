import org.junit.Test;

import static org.junit.Assert.*;

public class FootTest {

    @Test
    public void shouldKnowThatOneFootIsEqualToTwelveInches() throws Exception {
        assertTrue(new Foot(1).equals(new Inch(12)));
    }

    @Test
    public void shouldKnowOneFootIsNotEqualToAnyNumberOfInchesOtherThanTwelveInches() throws Exception {
        assertFalse(new Foot(1).equals(new Inch(13)));
    }

    @Test
    public void shouldKnowTwoLengthsInFeetAreEqualIfTheirValuesAreEqual() throws Exception {
        assertTrue(new Foot(16).equals(new Foot(16)));
    }

    @Test
    public void shouldKnowTwoLengthsInFeetAreNotEqualIfTheirValuesAreNotEqual() throws Exception {
        assertFalse(new Foot(31).equals(new Foot(17)));
    }

    @Test
    public void shouldKnowThatAFootIsNotNull() {
        assertFalse(new Foot(89).equals(null));
    }

    @Test
    public void shouldKnowThatTwoLengthsInFootWithTheSameAttributesHaveTheSameHashCode() {
        assertEquals(new Foot(17).hashCode(), new Foot(17).hashCode());
    }

    @Test
    public void shouldKnowThatFootAndAnInchWithEqualAttributesHaveDifferentHashCodes() throws Exception {
        assertNotEquals(new Foot(3).hashCode(), new Inch(3).hashCode());
    }

    @Test
    public void shouldKnowThatHashCodeOfAFootIsEqualToTheHashCodeOfTwelveInches() throws Exception {
        assertEquals(new Foot(1).hashCode(), new Inch(12).hashCode());
    }

    @Test
    public void shouldKnowThatHashCodeOfAFootIsNotEqualToTheHashCodeOfAnInch() throws Exception {
        assertNotEquals(new Foot(1).hashCode(), new Inch(1).hashCode());
    }
}

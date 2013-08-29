import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class InchTest {

    @Test
    public void shouldKnowThatAnInchIsNotNull() {
        assertFalse(new Inch(4).equals(null));
    }

    @Test
    public void shouldKnowThatAnInchIsNeverEqualToAnObjectThatIsNotALength() {
        assertFalse(new Inch(7).equals(new Object()));
    }

    @Test
    public void shouldKnowThatTwoLengthsInInchWithTheSameAttributesHaveTheSameHashCode() {
        assertEquals(new Inch(7).hashCode(), new Inch(7).hashCode());
    }

    @Test
    public void shouldKnowThatTwoLengthsInInchWithDifferentAttributesHaveDifferentHashCodes() {
        assertNotEquals(new Inch(14).hashCode(), new Inch(3).hashCode());
    }

    @Test
    public void shouldKnowThatTwoLengthsInFootWithDifferentAttributesHaveDifferentHashCodes() {
        assertNotEquals(new Foot(24).hashCode(), new Foot(8).hashCode());
    }
    @Test
    public void shouldKnowThatTwelveInchesIsEqualToOneFoot() throws Exception {
        assertTrue(new Inch(12).equals(new Foot(1)));
    }

    @Test
    public void shouldKnowTwelveInchesIsNotEqualToAnyNumberOfFeetOtherThanOneFoot() throws Exception {
        assertFalse(new Inch(12).equals(new Foot(2)));
    }

    @Test
    public void shouldKnowTwoLengthsInInchesAreEqualIfTheirValuesAreEqual() throws Exception {
        assertTrue(new Inch(3).equals(new Inch(3)));
    }

    @Test
    public void shouldKnowTwoLengthsInInchesAreNotEqualIfTheirValuesAreNotEqual() throws Exception {
        assertFalse(new Inch(3).equals(new Inch(7)));
    }
}

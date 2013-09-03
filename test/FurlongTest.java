import org.junit.Test;

import static org.junit.Assert.*;

public class FurlongTest {
    @Test
    public void shouldKnowThatAFurlongIsEqualToSixHundredAndSixtyFeet() throws Exception {
        assertTrue(new Furlong(1).equals(new Foot(660)));
    }

    @Test
    public void shouldKnowThatTwoFurlongsWithDifferentValuesAreNotEqual() throws Exception {
        assertFalse(new Furlong(7).equals(new Furlong(7920)));
    }

    @Test
    public void shouldKnowThatAFurlongIsEqualToSevenThousandNineHundredAndTwentyInches() throws Exception {
        assertTrue(new Furlong(1).equals(new Inch(7920)));
    }

    @Test
    public void shouldKnowThatAFurlongIsNotEqualToAnythingOtherThanLength() throws Exception {
        assertFalse(new Furlong(5).equals(new Object()));
    }
}
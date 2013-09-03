import org.junit.Test;

import static org.junit.Assert.*;

public class LeagueTest {
    @Test
    public void shouldKnowThatALeagueIsEqualToThreeMiles() throws Exception {
        assertTrue(new League(1).equals(new Mile(3)));
    }

    @Test
    public void shouldKnowThatTwoLeaguesWithDifferentValuesAreNotEqual() throws Exception {
        assertFalse(new League(7).equals(new League(45)));
    }

    @Test
    public void shouldKnowThatALeagueIsEqualToNineteenThousandAndEightyInches() throws Exception {
        assertTrue(new League(1).equals(new Inch(190080)));
    }

    @Test
    public void shouldKnowThatALeagueIsNotEqualToAnythingOtherThanLength() throws Exception {
        assertFalse(new League(5).equals(new Object()));
    }
}
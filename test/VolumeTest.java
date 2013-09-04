import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VolumeTest {

    @Test
    public void shouldKnowOneTableSpoonIsEqualToThreeTeaspoons(){
        assertTrue(new Volume(1, VolumeUnit.TABLESPOON).equals(new Volume(3, VolumeUnit.TEASPOON)));
    }
}

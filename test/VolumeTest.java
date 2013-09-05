import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeTest     {

    @Test
    public void shouldKnowThatATableSpoonIsEqualToItself() throws Exception {
        Volume volume = new Volume(1, VolumeUnit.TABLESPOON);
        assertTrue(volume.equals(volume));
    }
    @Test
     public void shouldKnowThatATeaspoonIsEqualToItself() throws Exception {
        Volume volume = new Volume(1, VolumeUnit.TEASPOON);
        assertTrue(volume.equals(volume));
    }

    @Test
    public void shouldKnowThatAVolumeIsNotEqualToNull() throws Exception {
        assertFalse(new Volume(1, VolumeUnit.TABLESPOON).equals(null));
    }

    @Test
    public void shouldKnowThatAVolumeIsNotEqualToAnyOtherObjectOtherThanAVolume() throws Exception {
        assertFalse(new Volume(2, VolumeUnit.TEASPOON).equals(new Object()));
    }

    @Test
    public void shouldKnowOneTableSpoonIsEqualToThreeTeaspoons() throws Exception {
        assertTrue(new Volume(1, VolumeUnit.TABLESPOON).equals(new Volume(3, VolumeUnit.TEASPOON)));
    }

    @Test
    public void shouldKnowThatTwoTablespoonsAreNotEqualToTwoTeaspoons() throws Exception {
        assertFalse(new Volume(2, VolumeUnit.TABLESPOON).equals(new Volume(2, VolumeUnit.TEASPOON)));
    }

    @Test
    public void shouldKnowThatATablespoonHasTheSameHashCodeAsThreeTeaspoons() throws Exception {
        assertEquals(new Volume(1, VolumeUnit.TABLESPOON).hashCode(), new Volume(3, VolumeUnit.TEASPOON).hashCode());
    }

    @Test
    public void shouldKnowThatATeaspoonHasADifferentHashCodeToATablespoon() throws Exception {
        assertNotEquals(new Volume(1, VolumeUnit.TABLESPOON).hashCode(), new Volume(1, VolumeUnit.TEASPOON).hashCode());
    }
}

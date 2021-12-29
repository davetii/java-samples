package com.greatwideweb.samples.puzzles;

import org.junit.Assert;
import org.junit.Test;

public class MorseCodeUnitTest {

    @Test
    public void ensureAValue() {
        MorseCode m = new MorseCode();
        Assert.assertEquals(".-",  m.getA());
    }

    @Test
    public void ensureuniqueMorseRepresentations() {
        MorseCode m = new MorseCode();
        Assert.assertEquals(2,  m.uniqueMorseRepresentations("gin", "zen", "gig", "msg"));

    }


}

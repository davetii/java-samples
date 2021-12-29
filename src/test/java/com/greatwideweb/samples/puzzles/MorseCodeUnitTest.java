package com.greatwideweb.samples.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MorseCodeUnitTest {

    @Test
    public void ensureAValue() {
        MorseCode m = new MorseCode();
        Assertions.assertEquals(".-",  m.getA());
    }

    @Test
    public void ensureuniqueMorseRepresentations() {
        MorseCode m = new MorseCode();
        Assertions.assertEquals(2,  m.uniqueMorseRepresentations("gin", "zen", "gig", "msg"));

    }


}

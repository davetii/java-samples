package software.daveturner.samples.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoRecurringCharactersUnitTest {

    @Test
    public void ensureNullIsSupportedf() {
        NoRecurringCharacters o = new NoRecurringCharacters();
        Assertions.assertEquals(false, o.hasDupChars(null));
    }

    @Test
    public void ensureSingleStringIsSupported() {
        NoRecurringCharacters o = new NoRecurringCharacters();
        Assertions.assertEquals(false, o.hasDupChars("s"));
    }

    @Test
    public void ensureDuplicatedCharReturnsExpected() {
        NoRecurringCharacters o = new NoRecurringCharacters();
        Assertions.assertEquals(true, o.hasDupChars("sas"));
    }

    @Test
    public void ensureDuplicatedCharReturnsExpected2() {
        NoRecurringCharacters o = new NoRecurringCharacters();
        Assertions.assertEquals(true, o.hasDupChars("sadthzs"));
    }

    @Test
    public void ensureUniqueCharReturnsExpected() {
        NoRecurringCharacters o = new NoRecurringCharacters();
        Assertions.assertEquals(true, o.hasDupChars("sab"));
    }


}

package software.daveturner.samples.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseSringLeetUnitTest {


    @Test
    public void ensureGreaterSizeReturnsReverse() {
        ReverseStringLeet o = new ReverseStringLeet();
        assertEquals("gfedcba", o.reversString3("abcdefg", 10));
    }

    @Test
    public void reverseString() {
        ReverseStringLeet o = new ReverseStringLeet();
        assertEquals("bacdfeg", o.reversString3("abcdefg", 2));
    }
}

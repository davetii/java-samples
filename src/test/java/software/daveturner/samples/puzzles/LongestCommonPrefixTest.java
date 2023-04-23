package software.daveturner.samples.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    LongestCommonPrefix lcp;

    @BeforeEach
    public void setup() {
        lcp = new LongestCommonPrefix();
    }

    @Test
    public void ensureLongestCommonPrefixHandlesErrors() {
        String[] list = {"", ""};
        //Assertions.assertEquals("", lcp.findLongestCommonPrefix(null));
        Assertions.assertEquals("", lcp.findLongestCommonPrefix(list));
    }

    @Test
    public void ensureLongestCommonPrefixReturnsExpected() {
        Assertions.assertEquals("fl", lcp.findLongestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assertions.assertEquals("a", lcp.findLongestCommonPrefix(new String[]{"ab", "a"}));
    }

    @Test
    public void ensureLongestCommonPrefixReturnsExpectedWithNoMatch() {
        Assertions.assertEquals("", lcp.findLongestCommonPrefix(new String[] {"flower", "rflow", "aflight"}));
    }


}

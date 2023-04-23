package software.daveturner.samples.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsUnitTest {

    @Test
    public void ensureWordsAreReversed() {
        ReverseWords w = new ReverseWords();
        Assertions.assertEquals("s'teL ekat edoCteeL tsetnoc",
                w.reverseWords2("Let's take LeetCode contest"));
    }


}

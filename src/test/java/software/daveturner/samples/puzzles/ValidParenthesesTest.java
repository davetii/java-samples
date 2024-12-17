package software.daveturner.samples.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    ValidParentheses vp = new ValidParentheses();

    @Test
    public void ensureValidParenthesesHandlesNull() {
        Assertions.assertFalse(vp.isValid(null));
        Assertions.assertFalse(vp.isValid(""));
        Assertions.assertFalse(vp.isValid("{"));
    }

    @Test
    public void ensureBasicOpsReturnsTrue() {
        Assertions.assertTrue(vp.isValid("{}"));
        Assertions.assertFalse(vp.isValid("{]"));
    }

    @Test
    public void ensureNestedReturnsExpected() {
        Assertions.assertTrue(vp.isValid("{()}"));
        Assertions.assertTrue(vp.isValid("[{()}]"));
        Assertions.assertTrue(vp.isValid("{[()()]}"));
    }



}
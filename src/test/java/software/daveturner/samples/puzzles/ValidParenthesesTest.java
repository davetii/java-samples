package software.daveturner.samples.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    ValidParentheses vp = new ValidParentheses();

    @Test
    public void ensureValidParenthesesHandlesNull() {
        assertFalse(vp.isValid(null));
        assertFalse(vp.isValid(""));
        assertFalse(vp.isValid("{"));
    }

    @Test
    public void ensureBasicOpsReturnsTrue() {
        assertTrue(vp.isValid("{}"));
        assertFalse(vp.isValid("{]"));
    }

    @Test
    public void ensureNestedReturnsExpected() {
        assertTrue(vp.isValid("{()}"));
        assertTrue(vp.isValid("[{()}]"));
        assertTrue(vp.isValid("{[()()]}"));
    }



}
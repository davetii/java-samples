package software.daveturner.samples.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharStudyTests {

    @Test
    public void number0Is48AsciiCharacter() {
        assertEquals(48, '0');
        assertTrue(48 == '0');
    }

    @Test
    public void number1Is49AsciiCharacter() {
        assertEquals('1', 49);
        assertEquals('1' + 1, 50);
    }

    @Test
    public void blankSpaceIs32AsciiCharacter() {
        int THIRTY_TWO = 32;
        char c =' ';
        assertEquals(THIRTY_TWO, c);
        // int can do store this as well
        int i =' ', spaceInHex = 0x20;
        assertEquals(THIRTY_TWO, i);
        assertEquals(THIRTY_TWO, spaceInHex);
        assertEquals(i, spaceInHex);

        // Character class has some helpers for this
        assertTrue(Character.isWhitespace(THIRTY_TWO));
        assertTrue(Character.isWhitespace(' '));
        assertTrue(Character.isSpaceChar(' '));
        assertTrue(Character.isSpaceChar(THIRTY_TWO));
        assertTrue(Character.isSpaceChar(spaceInHex));


    }

    @Test
    public void emptySpaceIs0AsciiCharacter() {

        // interesting this will NOT compile
        //char c ='';

        int empty = 0x0;
        char zeroChar = 0;
        assertEquals(zeroChar, empty);

        // 0 and '0' are NOT the same
        Assertions.assertNotEquals(zeroChar, '0');
    }


}


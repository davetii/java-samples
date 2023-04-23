package software.daveturner.samples.puzzles;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralToIntegerTest {

    RomanNumeralToInteger convertor;

    @BeforeEach
    public void setup() {
        convertor = new RomanNumeralToInteger();
    }

    @Test
    public void ensureRomanToIntErrorReturnsExpected() {
        assertEquals(0, convertor.romanToInt(null));
        assertEquals(0, convertor.romanToInt("B"));
        assertEquals(0, convertor.romanToInt("!"));
        assertEquals(0, convertor.romanToInt("XLVIIIW"));
        assertEquals(0, convertor.romanToInt("XLWVIIIW"));
    }

    @Test
    public void ensureRomanToIntReturnsExpectedForOnlyGrowing() {
        assertEquals(1, convertor.romanToInt("I"));
        assertEquals(2, convertor.romanToInt("II"));
        assertEquals(3, convertor.romanToInt("III"));
        assertEquals(5, convertor.romanToInt("V"));
        assertEquals(6, convertor.romanToInt("VI"));
        assertEquals(7, convertor.romanToInt("VII"));
        assertEquals(8, convertor.romanToInt("VIII"));
        assertEquals(10, convertor.romanToInt("X"));
        assertEquals(52, convertor.romanToInt("LII"));
        assertEquals(1600, convertor.romanToInt("MDC"));
        assertEquals(3000, convertor.romanToInt("MMM"));
    }


    @Test
    public void ensureRomanToInReturnsExpected() {
        assertEquals(4, convertor.romanToInt("IV"));
        assertEquals(9, convertor.romanToInt("IX"));
        assertEquals(48, convertor.romanToInt("XLVIII"));
        assertEquals(1994, convertor.romanToInt("MCMXCIV"));
    }


}


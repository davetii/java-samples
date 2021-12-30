package com.greatwideweb.samples.puzzles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumeralToInteger {

    /*
    constraints1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].
     */
    public int romanToInt(String s) {
        if(s== null) { return 0; }

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int calc = 0;

        try {
            for(int i=0; i< s.toCharArray().length;i++) {
                int current = map.get(s.charAt(i));
                int prev = 0;
                if(i > 0) {
                    prev = map.get(s.charAt(( i -1)));
                }

                if (prev < current) {
                    calc -= prev *2;
                }
                calc += current;
            }
            return calc;
        } catch(Exception e) {
            return 0;
        }


    }
}

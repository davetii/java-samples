package com.greatwideweb.samples.puzzles;

import java.nio.charset.StandardCharsets;

/*
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.
Constraints:

0 <= n < 109
 */
public class ComplementOfBase10Integer {

    public int bitwiseComplement(int n) {

        String s = Integer.toBinaryString(n);
        StringBuilder newString = new StringBuilder();
        for(int i=0; i< s.length(); i++) {
            if(s.substring(i, i+1).equals("0")) {
                newString.append("1");
            } else {
                newString.append("0");
            }
        }
        return Integer.parseInt(newString.toString(), 2);
    }
}

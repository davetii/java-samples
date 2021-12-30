package com.greatwideweb.samples.puzzles;

import java.util.*;

public class LongestCommonPrefix {

    /*
    public String findLongestCommonPrefix(String[] strs) {
        if(strs == null) { return ""; }
        if(strs.length == 1) { return strs[0]; }
        int counter= 0, charCount = 0;
        char prevChar = '\u0000';
        StringBuilder sb = new StringBuilder("");
        while(counter < 200) {
            for(int i= 0; i < strs.length; i++){
                char[] b = strs[i].toCharArray();
                if(b.length == 0) { return ""; }
                if((b.length -1) < counter) { return sb.toString(); }
                if(prevChar == '\u0000' || b[counter] == prevChar) {
                    charCount++;
                    prevChar = b[counter];
                } else {
                    break;
                }
            }
            if(charCount == strs.length) {
                sb.append(prevChar);
                prevChar = '\u0000';
                charCount = 0;
            } else {
                return sb.toString();
            }
            counter++;
        }
        return sb.toString();
    }*/


    public String findLongestCommonPrefix(String[] strs) {
        if(strs == null) { return ""; }
        if(strs.length == 1) { return strs[0]; }
        int thing = strs.length - 1;
        char[] firstChars = strs[0].toCharArray();
        StringBuilder sb = new StringBuilder("");
        int matchCount = 0;
        for(int i = 0; i < firstChars.length; i++) {
            matchCount = 0;
            for(int x =1; x < strs.length; x++ ) {
                char[] currentChars = strs[x].toCharArray();
                if(currentChars.length == 0) { return ""; }
                if((currentChars.length -1) < i) { return sb.toString(); }

                if (currentChars[i] == firstChars[i]) {
                    matchCount++;
                } else {
                    return sb.toString();
                }
            }
            if (matchCount == thing) {
                sb.append(firstChars[i]);
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}

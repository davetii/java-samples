package com.greatwideweb.samples.puzzles;

public class LongestCommonPrefix {

    public String findLongestCommonPrefix(String[] strs) {
        if(strs == null) { return ""; }
        if(strs.length == 1) { return strs[0]; }

        String stringToChop  = strs[0];
        for(int i=1; i < strs.length; i++) {

            while(strs[i].indexOf(stringToChop) != 0) {
                stringToChop = stringToChop.substring(0,stringToChop.length() -1 );
            }
        }
        return stringToChop;
    }
}

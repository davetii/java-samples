package com.greatwideweb.samples.basics;

public class StrStrImpl {

/*
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null) { return 0; }
        if(haystack.length()==0) return 0;
        if(needle.length()==0) return 0;
        return haystack.indexOf(needle);
    }
*/


    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null) { return 0; }
        if(haystack.length()==0) return 0;
        if(needle.length()==0) return 0;

        for (int i = 0; i <  haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                if((i + needle.length()) <= haystack.length() && haystack.startsWith(needle, i)) { return i; }
            }
        }
        return -1;
    }

}

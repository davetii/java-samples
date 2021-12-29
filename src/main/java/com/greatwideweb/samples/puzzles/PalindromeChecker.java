package com.greatwideweb.samples.puzzles;

public class PalindromeChecker {

    public boolean isPalindrome(Integer i) {
        if(i == null) { return false; }
        if(i < 0) { return false; }
        if(Integer.toString(i).length() == 1) { return true; }
        int num = i;
        int reveresed = 0;
        while(num != 0) {
            int digit = num %10;
            System.out.println("digit: " + digit);
            reveresed = reveresed * 10 + digit;
            System.out.println("reversed: " + reveresed);
            num /=10;
            System.out.println("num: " + num);
        }
        return (i == reveresed);
    }
}

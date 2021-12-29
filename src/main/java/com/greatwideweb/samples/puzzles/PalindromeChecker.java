package com.greatwideweb.samples.puzzles;

public class PalindromeChecker {

    public PalindromeChecker() {

    }

    public boolean isPalindrome(int i) {
        if(i < 0) { return false; }
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

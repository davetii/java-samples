package com.greatwideweb.samples.recursion;

public class Fibonacci {

    public int head(int n) {
        if(n == 0) { return 0; }
        if(n == 1) { return 1; }
        return head(n -1) +  head(n -2);
    }
}

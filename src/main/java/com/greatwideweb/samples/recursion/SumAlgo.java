package com.greatwideweb.samples.recursion;

public class SumAlgo {
    public int sum(int n) {
        if(n <= 0) { return 0; }
        if(n == 1) { return 1; }
        return n + sum(n-1);
    }
}

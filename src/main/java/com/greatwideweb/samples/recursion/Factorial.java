package com.greatwideweb.samples.recursion;

public class Factorial {

    public int head(int i) {
        if(i < 2) { return 1; }
        int operation =  head(i -1);
        return i *operation;

    }

    public int tail(int i) {
        if(i < 2) { return 1; }
        return i * head(i -1);
    }
}

package com.greatwideweb.samples.algo;

public class BasicRecursion {

    public static void reduceByOne(int n) {
        if (n >= 0) {
            reduceByOne(n-1);
        }
        System.out.println("n: " + n);
    }
    public static void main(String[] args) {
        reduceByOne(10);
    }
}

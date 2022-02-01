package com.greatwideweb.samples.recursion;

public class HeadRecursionExample {


    public static void main(String[] args) {
        HeadRecursionExample o = new HeadRecursionExample();
        o.tail(5);
    }

    private void tail(int i) {
        System.out.println("calling head with parameter=" + i);
        if(i == 0) { return; }
        System.out.println("i=" + i);
        tail(i-1);
    }

    private void head(int i) {
        System.out.println("calling head with parameter=" + i);
        if(i == 0) { return; }
        head(i-1);
        if(i == 1) {
            System.out.println("\nhead method will now enter the Back tracking phase\n");
        }
        System.out.println("i=" + i);
        /*
        output
        calling head with parameter=5
        calling head with parameter=4
        calling head with parameter=3
        calling head with parameter=2
        calling head with parameter=1
        calling head with parameter=0

        head method will now enter the Back tracking phase

        i=1
        i=2
        i=3
        i=4
        i=5

        Note the 2 phases the operation and backtracking phases of the method call
         */
    }
}

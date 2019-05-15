package com.greatwideweb.samples.lambdas;

import java.util.function.Predicate;

public class LambdasExample {

    interface Dribbler { void dribbles(); }

    public static void main(String[] args) {
        Dribbler d =  () -> System.out.println("Dribbling ");
        d.dribbles();

        Predicate<String> test = "TEST"::equals;
        System.out.println("Is Correct: " + test.test("Bob"));
        System.out.println("Is Correct: " + test.test("TEST"));




    }
}

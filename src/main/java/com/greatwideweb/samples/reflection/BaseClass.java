package com.greatwideweb.samples.reflection;

public class BaseClass {

    private String greeting = "Hello World";
    private final String finalGreetingString = "Final Greeting";
    private final Object finalGreetingObject = "Final Greeting";


    public final String getGreeting() { return greeting; }
    public final String getFinalGreetingString() { return finalGreetingString; }
    public final Object getFinalGreetingObject() { return finalGreetingObject; }

}

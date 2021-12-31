package com.greatwideweb.samples.reference;

public class TestVO {

    private String testString;

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public static void main(String[] args) {
        TestVO tvo = new TestVO();
        tvo.setTestString("I am a test String");
        String test = tvo.getTestString();
        tvo.setTestString(null);
        System.out.println("tvo: " + tvo.getTestString() );
        System.out.println("test: " + test );

        String test2 = "I am another test";
        tvo.setTestString(test2);

        String test3  = test2;
        test2 = null;

        System.out.println("tvo: " + tvo.getTestString() );
        System.out.println("test2: " + test2 );
        System.out.println("test3: " + test3 );

    }
}

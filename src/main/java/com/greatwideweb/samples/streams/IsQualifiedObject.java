package com.greatwideweb.samples.streams;

public class IsQualifiedObject {

    private boolean isQualified;
    private final String name;
    private final int score;

    public IsQualifiedObject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public boolean isQualified() {
        return isQualified;
    }

    public void setQualified(boolean qualified) {
        isQualified = qualified;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

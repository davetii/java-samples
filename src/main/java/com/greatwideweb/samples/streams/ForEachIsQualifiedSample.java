package com.greatwideweb.samples.streams;

import java.util.List;

public class ForEachIsQualifiedSample {

    private final int qualifyingScore;

    public ForEachIsQualifiedSample(int QualifyingScore) {
        this.qualifyingScore = QualifyingScore;
    }

    public void processList(List<IsQualifiedObject> list) {
        list.forEach(item -> item.setQualified(item.getScore() >= qualifyingScore));
    }


}

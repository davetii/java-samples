package com.greatwideweb.samples.methodreference;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class PlayerMethodReferenceSample {
    private final String firstName;
    private final String lastName;
    private final String position;

    public PlayerMethodReferenceSample(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getDescr() {
        return this.position + ": " + this.firstName  + " " + this.lastName;
    }

    public static List<String> buildDetailList (List<PlayerMethodReferenceSample> players) {
        return players.stream()
                .map(PlayerMethodReferenceSample::getDescr)
                .collect(toList());
    }
}

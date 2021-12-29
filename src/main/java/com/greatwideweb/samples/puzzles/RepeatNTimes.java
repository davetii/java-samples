package com.greatwideweb.samples.puzzles;

import java.util.HashSet;
import java.util.Set;

public class RepeatNTimes {

    public int repeatedNTimes(int[] a) {
        Set<Integer> s = new HashSet<>();
        for(int i : a) {
            if (!s.add(i)) { return i; }
        }
        return 0;
    }
}

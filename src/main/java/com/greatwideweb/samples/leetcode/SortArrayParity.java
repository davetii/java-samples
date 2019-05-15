package com.greatwideweb.samples.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SortArrayParity {

    public int[] sortArrayParity(int[] a) {
        int[] result = new int[a.length];
        int counter =0;
        List<Integer> odds = new ArrayList<>();
        for (int i : a) {
            if(i % 2 == 0) {
                result[counter] = i;
                counter++;
            } else {
                odds.add(i);
            }
        }

        for(int x : odds) {
            result[counter] = x;
            counter++;
        }

        return result;
    }
}

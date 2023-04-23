package software.daveturner.samples.puzzles;

import java.util.*;

/*
In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 */
public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {
        if(trust.length ==0 && n == 1) { return 1;}
        if(trust.length ==0) { return -1;}

        Map<Integer, Integer> trustedNumbers = new HashMap<>();
        Set<Integer> numbersThatTrusted = new TreeSet<>();
        Set<Integer> uniques = new TreeSet<>();

        for (int[] child : trust) {
            if(child.length == 0) { return -1;}
            numbersThatTrusted.add(child[0]);
            uniques.add(child[0]);
            uniques.add(child[1]);
            if(trustedNumbers.containsKey(child[1])) {
                trustedNumbers.put(child[1], (trustedNumbers.get(child[1]) + 1));
            } else {
                trustedNumbers.put(child[1], 1);
            }
        }

        if((numbersThatTrusted.size() + 1) != uniques.size()) {
            return -1;
        }

        for(int i : trustedNumbers.keySet() ){
            if(!numbersThatTrusted.contains(i) && trustedNumbers.get(i) == numbersThatTrusted.size() ) {
               return i;
            }
        }
        return -1;
    }
}

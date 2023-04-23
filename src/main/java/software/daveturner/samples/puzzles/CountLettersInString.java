package software.daveturner.samples.puzzles;

import java.util.*;

public class CountLettersInString {

    /*
        Convert String to Map, key is string, value=count of occurrences
        loop over keyset find most values
        loop over keyset find ALL with equal to most values
     */
    public List<String> firstMostOccurringLetter(String s) {
        if (s == null) { return null;}
        if (s.replace(" ", "").length() ==0) { return null; }
        String preparedString = s.trim().replace(" ", "").toLowerCase(Locale.ROOT);
        Map<String, Integer> occurrences = new HashMap<>();
        for(int i=0; i < preparedString.length(); i++) {
            String targetString = Character.toString(preparedString.charAt(i));
            Integer currentValue = occurrences.get(targetString);
            if(currentValue == null) {
                currentValue=0;
            }
            occurrences.put(targetString, ++currentValue);
        }

        Integer topCount = 0;
        List<String> response = new ArrayList<>();

        for(String key : occurrences.keySet()) {
            Integer currentCount  = occurrences.get(key);
            if(currentCount >= topCount) {
                topCount = currentCount;
            }
        }

        for(String key : occurrences.keySet()) {
            if(occurrences.get(key) >= topCount) {
                response.add(key);
            }
        }
        return response;
    }

}

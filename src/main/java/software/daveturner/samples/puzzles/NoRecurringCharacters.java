package software.daveturner.samples.puzzles;

import java.util.HashSet;
import java.util.Set;

public class NoRecurringCharacters {



    public boolean hasDupChars(String s) {
        if(s == null || s.length() < 2) { return false; }

        Set set = new HashSet();
        for(int i=0; i < s.length(); i++) {
            set.add(s.charAt(i));
            if (set.size() < i) { return false; }
        }
        return true;
    }
}

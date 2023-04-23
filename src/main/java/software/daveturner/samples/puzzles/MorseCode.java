package software.daveturner.samples.puzzles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MorseCode {

    HashMap<String, String> map;

    public MorseCode() {
        map = new HashMap<String, String>();
        map.put("a", ".-");
        map.put("b", "-...");
        map.put("c", "-.-.");
        map.put("d", "-..");
        map.put("e", ".");
        map.put("f", "..-.");
        map.put("g", "--.");
        map.put("h", "....");
        map.put("i", "..");
        map.put("j", ".---");
        map.put("k", "-.-");
        map.put("l", ".-..");
        map.put("m", "--");
        map.put("n", "-.");
        map.put("o", "---");
        map.put("p", ".--.");
        map.put("q", "--.-");
        map.put("r", ".-.");
        map.put("s", "...");
        map.put("t", "-");
        map.put("u", "..-");
        map.put("v", "...-");
        map.put("w", ".--");
        map.put("x", "-..-");
        map.put("y", "-.--");
        map.put("z", "--..");
    }

    public String getA() {
        return map.get("a");
    }

    public int uniqueMorseRepresentations(String... words) {
        Set<String> uMorse = new HashSet<>();
        for(String s : words) {
            StringBuffer buf = new StringBuffer(s);
            StringBuilder sb = new StringBuilder();
            for (char w : s.toCharArray()) {
                sb.append(map.get(String.valueOf(w)));
            }
            uMorse.add(sb.toString());
        }
        return uMorse.size();
    }
}

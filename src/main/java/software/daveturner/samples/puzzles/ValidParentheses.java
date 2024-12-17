package software.daveturner.samples.puzzles;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null || s.length() < 2) { return false;}
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');
        Deque<Character> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()) {

            if(pairs.containsValue(c)) { stack.push(c); }
            if(pairs.containsKey(c)) {
                if (pairs.get(c) == stack.peekFirst()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

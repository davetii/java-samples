package software.daveturner.samples.puzzles;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringLeet {
    public String reverseString(String input, int k) {
        StringBuilder r = new StringBuilder();
        char[] chars = input.toCharArray();
        if (chars.length < k || k == 0) {
            for(int i = chars.length -1; i >= 0; i--) {
                r.append(Character.valueOf(chars[i]));
            }
            return r.toString();
        }

        List<String> allStrings = new ArrayList<String>();

        String EMPTY_STRING = "";
        StringBuilder temp = new StringBuilder(EMPTY_STRING);
        int inc = 0;
        for(int i = 0; i < chars.length; i++) {
            inc ++;
            temp.append(Character.valueOf(chars[i]));
            if(inc == k) {
                allStrings.add(temp.toString());
                inc = 0;
                temp = new StringBuilder(EMPTY_STRING);
            }

            if(i == chars.length -1) {
                allStrings.add(temp.toString());
            }
        }

        for(int i = 0; i < allStrings.size(); i++) {
            if(i % 2 == 0) {
                char[] subChars = allStrings.get(i).toCharArray();
                for(int x = subChars.length -1; x >= 0; x--) {
                    r.append(Character.valueOf(subChars[x]));
                }
            } else {
                r.append(allStrings.get(i));
            }
        }
        return r.toString();
    }

    public String reverseStringCorrect(String s, int k) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i += 2 *k) {

            for(int j = i; j < i + k && j < s.length(); j++) {
                str.insert(i, s.charAt(j));
            }

            for(int j = i + k; j < i + 2 * k && j < s.length(); j++) {
                str.append(s.charAt(j));
            }
        }
        return str.toString();
    }

    public String reversString3(String s, int k) {
        StringBuilder str = new StringBuilder();
        boolean isEven = true;
        int j, i=0;
        for(; i < s.length() ; i += k) {

            if(isEven) {

                for(j =  i + (k -1); j >= i; j--) {
                    if(j < s.length()) {
                        str.append(s.charAt(j));
                    }
                }

                isEven = false;
            } else {

                for(j = i; j < i + k; j++) {
                    if(j < s.length()) { str.append(s.charAt(j)); }
                }

                isEven = true;

            }
        }
        return str.toString();
    }
}

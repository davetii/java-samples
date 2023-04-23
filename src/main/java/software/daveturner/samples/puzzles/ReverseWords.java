package software.daveturner.samples.puzzles;

public class ReverseWords {

    public String reverseWords(String input) {
        String[] strings = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            for (int j = chars.length -1; j >= 0; j--) {
                sb.append(chars[j]);
            }
            if(i != strings.length -1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();
        String EMPTY_SPACE = " ";
        for(String word: s.split(EMPTY_SPACE)) {
            sb.append(new StringBuffer(word).reverse().toString()).append(EMPTY_SPACE);
        }
        return sb.toString().trim();

    }
}

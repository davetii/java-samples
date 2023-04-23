package software.daveturner.samples.regex;

import org.apache.commons.lang3.StringEscapeUtils;

public class EscapeHtml {

    public static void main(String[] args) {
        String testString = "I<am&a<t<>eststri&ng";
        //String formattedString = testString.replaceAll("<>&", "");
        String formattedString = StringEscapeUtils.escapeHtml4(testString);
        String expectedAnswer = "Iamateststring";


        if(formattedString.equals(expectedAnswer)) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
            System.out.println("formattedString: " + formattedString);
            System.out.println("expectedAnswer: " + expectedAnswer);
        }


    }
}

package com.greatwideweb.samples.basics;

import java.util.HashSet;
import java.util.Set;

public class EmailVaildator {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Set<String> emailsToSend = new HashSet<>();
        for(String email : emails) {
            String[] emailParts = email.split("@");
            if(emailParts.length != 2) { continue; }
            if(emailParts[0].isEmpty() || emailParts[1].isEmpty()) { continue; }
            if (!hasValidChars("abcdefghijklmnopqrstuvwxyz.",emailParts[0])) {
                continue;
            }

            if (!hasValidChars("abcdefghijklmnopqrstuvwxyz.+",emailParts[1])) {
                continue;
            }
            emailsToSend.add(cleanLocal(emailParts[0]) + "@" + emailParts[1]);
        }
        for(String s : emailsToSend) {
            System.out.println(s);
        }
    }

    private static String cleanLocal(String s) {
        String result = s.replace(".", "");
        if(result.indexOf("+") > -1) {
            return result.substring(0, result.indexOf("+"));
        }
        return result;
    }

    private static boolean hasValidChars(String acceptable, String input) {
        boolean isFound = false;
        for(char s : input.toCharArray()) {
            isFound = false;
            for (char c : acceptable.toCharArray()) {
                if (s == c) { isFound  = true; break; }
            }
        }
        return isFound;
    }

}

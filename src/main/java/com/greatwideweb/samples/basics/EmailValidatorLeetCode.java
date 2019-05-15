package com.greatwideweb.samples.basics;

import java.util.HashSet;
import java.util.Set;

public class EmailValidatorLeetCode {
    public static void main(String[] args) throws Exception {
        String goodChars = "abcdefghijklmnopqrstuvwxyz+.";
        String input = "david.turner+remove@nowhere.com.com";
        String expectedEmail = "davidturner@nowhere.com.com";
        String[] parts = input.split("@");
        System.out.println();
        System.out.println();
        if (parts.length != 2) {
            throw new Exception("not valid");
        }

        for(char c : parts[0].toCharArray()) {
            boolean isValid = false;
            for(char t : goodChars.toCharArray()) {
                if(t == c) {
                    isValid = true;
                    break;
                }
            }
            if(!isValid) {
                throw new Exception("not valid");
            }
        }

        for(char c : parts[1].toCharArray()) {
            boolean isValid = false;
            for(char t : goodChars.toCharArray()) {
                if(t == c) {
                    isValid = true;
                    break;
                }
            }
            if(!isValid) {
                throw new Exception("not valid");
            }
        }

        String local = parts[0].replace(".", "");
        if (local.indexOf("+") > 0) {
            local = local.substring(0, local.indexOf("+"));
        }

        Set<String> realEmails = new HashSet<>();
        realEmails.add(local + "@" + parts[1]);
    }
}


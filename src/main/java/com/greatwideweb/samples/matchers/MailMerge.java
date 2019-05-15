package com.greatwideweb.samples.matchers;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MailMerge {

    private final Pattern NAME_PATTERN = Pattern.compile("<<name>>");
    private final Pattern DESCR_PATTERN = Pattern.compile("<<descr>>");

    private final String input;
    private final List<String> results;

    public MailMerge(String newInput, List<Map<String, String>>data) {
        this.input = newInput;
        results = data.stream()
                .map(this::replaceValues)
                .collect(Collectors.toList());
    }

    public List<String> getResults() { return this.results; }

    private String replaceValues(Map<String, String> map) {
        Matcher matcher = NAME_PATTERN.matcher(this.input);
        String name = map.keySet().toArray()[0].toString();
        matcher =  DESCR_PATTERN.matcher(matcher.replaceAll(name));
        return matcher.replaceAll(map.get(name));
    }
}

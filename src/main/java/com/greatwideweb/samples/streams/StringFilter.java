package com.greatwideweb.samples.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {

    private List<String> result;
    private Predicate<String> filter;

    public StringFilter(String stringToFind) {
        this.filter = s -> s.equals(stringToFind);
    }

    public List<String> filter(List<String> list) {
        return list.stream()
                .filter(this.filter)
                .collect(Collectors.toList());
    }

}

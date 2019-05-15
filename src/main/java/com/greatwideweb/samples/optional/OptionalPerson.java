package com.greatwideweb.samples.optional;

import java.util.Optional;

public class OptionalPerson {
    private String firstName;
    private String lastName;
    private Integer age;

    public OptionalPerson(String f) {
        this.firstName = f;
    }

    public OptionalPerson(String f, String lastName) {
        this.firstName = f;
        this.lastName = lastName;
    }

    public OptionalPerson(String f, String lastName, Integer age) {
        this.firstName = f;
        this.lastName = lastName;
        this.age = age;
    }

    public Optional<String> getFirstName() { return Optional.ofNullable(this.firstName); }
    public Optional<String> getLastName() { return Optional.ofNullable(this.lastName); }
    public Optional<Integer> getAge() { return Optional.ofNullable(this.age); }


}

package ru.gb.study.java.andrey;

import java.util.*;

public class Phonebook {
    private final Map<String, Set<String>> book = new HashMap<>();

    public void add(String name, String phoneNumber) {
        if (book.containsKey(name)) {
            book.get(name).add(phoneNumber);
        } else {
            Set<String> numbers = new HashSet<>();
            numbers.add(phoneNumber);
            book.put(name, numbers);
        }
    }

    public Set<String> get(String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        }
        return Collections.emptySet();
    }

}

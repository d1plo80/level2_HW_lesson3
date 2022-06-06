package ru.gb.study.java.andrey;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        doTask();
    }

//    static void doTask() {
//        String[] words = {"HOme", "HoMe", "work", "WORK", "lesson", "lesson", "Level",
//                "level", "Test", "test"};
//        Set<String> unique = new HashSet<>(Arrays.asList(words));
//        System.out.println(unique);
//
//        Map<String, Integer> counter = new HashMap<>();
//        for (int i = 0; i < words.length; i++) {
//            if (counter.containsKey(words[i])) {
//                counter.put(words[i], counter.get(words[i]) + 1);
//            } else {
//                counter.put(words[i], 1);
//            }
//        }
//
//        System.out.println(counter);
//    }

    static void doTask() {
        Phonebook book = new Phonebook();
        book.add("Oleg", "8-800-3939");
        book.add("Oleg", "8-800-3940");
        book.add("Oleg", "8-800-3941");
        book.add("Pavel", "8-800-4040");
        System.out.println(book.get("Oleg"));
    }
}
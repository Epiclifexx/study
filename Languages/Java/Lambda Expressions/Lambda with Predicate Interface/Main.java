package org.example;

import java.util.function.Predicate;

// This is how Lambda expressions work with Predicate Interface:
public class Main {
    public static void main(String[] args) {
        // Predicate is a built-in functional interface that takes an argument and returns a boolean.
        // Here we create a Predicate to determine whether a String is larger than five characters.
        Predicate<String> largerThan5 = s -> s.length() > 5;

        // We catch that boolean value:
        boolean result = largerThan5.test("hello!");

        // And then, print it:
        System.out.println(result);
    }
}
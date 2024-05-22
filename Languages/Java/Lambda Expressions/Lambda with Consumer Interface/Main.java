package org.example;

import java.util.function.Consumer;

// This is how Lambda expressions work with Consumer Interface:
public class Main {
    public static void main(String[] args) {
        // Consumer is a functional interface that takes only one parameter and returns nothing.
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("I <3 Half Life");
    }
}
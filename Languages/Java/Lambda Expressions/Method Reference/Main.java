package org.example;

import java.util.function.Consumer;

// Method References:
public class Main {
    public static void main(String[] args) {
        /*
        * For Lambda Expressions there's this shorthand syntax called "Method Reference".
        * When we use a Lambda Expression to trigger another existing method, we can write this in a
        * shorter way, namely with a Method Reference.
        *
        * This can only be used for existing methods.
        *
        * It has a different syntax, with double colon :: and there are some variations on how to do it.
        * Here's an example with the Consumer that only prints a message:
        * */

        Consumer<String> printMessage = System.out::println;
        printMessage.accept("Hola!");
    }
}
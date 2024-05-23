package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Stream API - Creation of Streams:
public class Main {
    public static void main(String[] args) {

        /*
        * The Stream API allows us to process and manipulate datasets using a functional programming approach.
        * It can also simplify our code when handling datasets.
        *
        * Let's start by talking about "Streams" -> What are these?
        * A Stream is a sequence of elements that can be processed sequentially or in parallel.
        *
        * Streams have a source. They can be created in various ways using the Stream API.
        * You can create a Stream from various sources. Such as collections, arrays, I/O channels, etc.
        * */

        // Creating a Stream from a Collection:
        List<String> names = Arrays.asList("Gordon", "Kleiner", "Alyx");
        Stream<String> nameStream = names.stream();

        // Creating a Stream from an Array:
        String[] namesArray = {"Mikasa", "Eren", "Armin"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        // Creating a Stream using the Stream.of() method:
        Stream<String> namesOfStream = Stream.of("Chris", "Ted", "Aiden");

    }
}
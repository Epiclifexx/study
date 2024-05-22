package org.example;

// Now here we have a good ol' Main Method.
public class Main {
    public static void main(String[] args) {
        // This is the "NON-LAMBDA APPROACH" of doing this:
        Cat myCat = new Cat();
        myCat.print();

        /* If you run this code (considering you already have the "Cat" class and "Printable" Interface...)
        You can see that there's relatively a lot of stuff to do in order to just execute this implementation.
        First, you have to create a class that implements the method, then you have to create an object of
        that class in the Main, and finally call it, although, it could be even more steps in between if the
        code itself is a little more complex than this.

        So, at the end of the day, the only thing you really care is the implementation itself... this is
        where the lambdas come in.
        */
    }
}
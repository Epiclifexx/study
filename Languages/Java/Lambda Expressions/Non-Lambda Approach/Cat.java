package org.example;

// Here we have a simple test class that implements the "Printable" Interface:
public class Cat implements Printable{

    // Just a couple of properties to set a testing environment:
    public String name;
    public int age;

    // An empty Constructor:
    public Cat(){
    }

    // And here we have the implementation itself of Printable's method "print":
    public void print(){
        System.out.println("Meow");
    }
}
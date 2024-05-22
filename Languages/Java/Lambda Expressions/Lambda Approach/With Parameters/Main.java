package org.example;

public class Main {
    public static void main(String[] args) {
        // This is the "LAMBDA APPROACH" with parameters:
        Printable lambdaCalculator = (a,b) -> a+b;
        System.out.println(lambdaCalculator.print(15,15));

        /*
        * Now, the print method requires integer, here, in the implementation you can see that we
        * put two values, but it is not necessary to specify the type, Java already knows that we're working
        * with integers.
        * */
    }
}
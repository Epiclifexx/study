package org.example;

public class Main {
    public static void main(String[] args) {
        // This is the "LAMBDA APPROACH" of doing this:
        Printable lambdaCat = () -> System.out.println("Meow!");
        lambdaCat.print();

        /*
        * As you can see, it's all simplified into one or two lines of code.
        * The syntax for the lambda function is as follows: () -> { expression };
        *
        * So, the "()" represents the parameters (in this particular case, we don't have any)
        * The -> it's just an arrow that separates the parameters from the function
        * And finally, the { expression } itself. Here we just code the implementation we need.
        * You'll see that in this example, I didn't need to use the { ... }.
        * This is because, if the expression is only one line, there's no need to use them.
        * */
    }
}
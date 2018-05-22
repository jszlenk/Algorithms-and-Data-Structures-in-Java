package Factorial;

import static Factorial.IterativeFactorial.iterativeFactorial;
import static Factorial.RecursiveFactorial.recursiveFactorial;

public class Main {
    public static void main(String[] args) {

        System.out.println(iterativeFactorial(4));
        System.out.println(recursiveFactorial(4));
    }
}
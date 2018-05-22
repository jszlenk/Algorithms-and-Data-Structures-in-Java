package Recursion;

import static Recursion.IterativeFactorial.iterativeFactorial;
import static Recursion.RecursiveFactorial.recursiveFactorial;

public class Main {
    public static void main(String[] args) {

        System.out.println(iterativeFactorial(4));
        System.out.println(recursiveFactorial(4));
    }
}
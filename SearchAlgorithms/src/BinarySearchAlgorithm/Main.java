package BinarySearchAlgorithm;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {0, 1, 2, 3, 4, 5, 6};

        System.out.println(IterativeBinary.iterativeBinarySearch(intArray, 2));
        System.out.println(IterativeBinary.iterativeBinarySearch(intArray, 4));
        System.out.println("-------------------");
        System.out.println(RecursiveBinary.recursiveBinarySearch(intArray, 5));
        System.out.println(RecursiveBinary.recursiveBinarySearch(intArray, 6));
    }
}
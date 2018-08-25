package LinearSearchAlgorithm;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(linearSearch(intArray, 5));
        System.out.println(linearSearch(intArray, 6));
        System.out.println(linearSearch(intArray, 61));
    }

    private static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }

        return -1;
    }
}

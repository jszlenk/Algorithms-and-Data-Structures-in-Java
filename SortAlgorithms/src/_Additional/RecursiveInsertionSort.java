package _Additional;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] intArray = {6, 2, 4, 3, 5, 1};

        insertionSort(intArray, intArray.length);

        for (int anIntArray : intArray) {
            System.out.println(anIntArray);
        }
    }

    private static void insertionSort(int[] input, int numItems) {

        if (numItems < 2) {
            return;
        }

        insertionSort(input, numItems - 1);

        int newElement = input[numItems - 1];

        int i;

        for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }

        input[i] = newElement;

        for (i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
    }
}

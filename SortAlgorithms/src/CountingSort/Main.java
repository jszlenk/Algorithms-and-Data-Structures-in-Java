package CountingSort;

import static CountingSort.CountingSort.countingSort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {10, 10, 3, 2, 4, 3, 2, 1, 7, 4};

        countingSort(intArray, 1, 10);

        for (int anIntArray : intArray) {
            System.out.println(anIntArray);
        }
    }
}

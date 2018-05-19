package SelectionSort;

import static SelectionSort.Swap.swap;

class SelectionSort {
    static void selection(int[] intArray) {
        for (int lastIndex = intArray.length - 1; lastIndex > 0; lastIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastIndex);
        }
    }
}

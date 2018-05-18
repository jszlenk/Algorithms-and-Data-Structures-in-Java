package BubbleSort;

import static BubbleSort.Swap.swap;

class BubbleSort {

    static void bubble(int[] intArray) {
        for (int unsortedIndex = intArray.length - 1; unsortedIndex > 0; unsortedIndex--) {
            for (int index = 0; index < unsortedIndex; index++) {
                if (intArray[index] > intArray[index + 1]) {
                    swap(intArray, index, index + 1);
                }
            }
        }
    }
}
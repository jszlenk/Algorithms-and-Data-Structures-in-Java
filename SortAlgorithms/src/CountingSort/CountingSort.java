package CountingSort;

import java.util.stream.IntStream;

class CountingSort {

    static void countingSort(int[] array, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        IntStream.range(0, array.length).forEach(index -> countArray[array[index] - min]++);

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}

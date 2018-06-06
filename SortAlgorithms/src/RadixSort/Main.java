package RadixSort;

import static RadixSort.RadixSort.radixSort;

public class Main {

    public static void main(String[] args) {

        int[] radixArray = {9925, 1186, 1440, 8082, 2392, 6514};

        radixSort(radixArray, 10, 4);

        for (int aRadixArray : radixArray) {
            System.out.println(aRadixArray);
        }
    }
}

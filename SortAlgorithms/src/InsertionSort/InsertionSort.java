package InsertionSort;

class InsertionSort {

    static void insertion(int[] intArray) {
        for (int firstIndex = 1; firstIndex < intArray.length; firstIndex++) {
            int newElement = intArray[firstIndex];

            int i;
            for (i = firstIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
    }
}

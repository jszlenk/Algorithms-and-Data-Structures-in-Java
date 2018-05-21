package ShellSort;

class ShellSort {

    static void shell(int[] intArray) {
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int index = gap; index < intArray.length; index++) {
                int newElement = intArray[index];

                int j = index;
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }
    }
}

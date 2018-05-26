package QuickSort;

class QuickSort {
    static void quickSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int index = start;
        int j = end;

        while (index < j) {

            while (index < j && array[--j] >= pivot) ;
            if (index < j) {
                array[index] = array[j];
            }

            while (index < j && array[++index] <= pivot) ;
            if (index < j) {
                array[j] = array[index];
            }

        }

        array[j] = pivot;
        return j;

    }
}
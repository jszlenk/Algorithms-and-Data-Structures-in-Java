package MergeSort;

class MergeSort {
    static void mergeSort(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {

        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int index = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (index < mid && j < end) {
            temp[tempIndex++] = array[index] <= array[j] ? array[index++] : array[j++];
        }

        System.arraycopy(array, index, array, start + tempIndex, mid - index);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}

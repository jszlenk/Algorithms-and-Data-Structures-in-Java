package _Additional;

public class DescendingMergeSort {
    public static void main(String[] args) {
        int[] intArray = {25, 0, -8, -15, -4, 22, 7, 7, 1, -22, 14, 1};

        descendingMergeSort(intArray, 0, intArray.length);

        for (int anIntArray : intArray) {
            System.out.println(anIntArray);
        }
    }

    private static void descendingMergeSort(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        descendingMergeSort(array, start, mid);
        descendingMergeSort(array, mid, end);
        descendingMerge(array, start, mid, end);
    }

    private static void descendingMerge(int[] array, int start, int mid, int end) {

        if (array[mid - 1] >= array[mid]) {
            return;
        }

        int index = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (index < mid && j < end) {
            temp[tempIndex++] = array[index] >= array[j] ? array[index++] : array[j++];
        }

        System.arraycopy(array, index, array, start + tempIndex, mid - index);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}

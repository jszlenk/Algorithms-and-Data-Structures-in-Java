package MergeSort;

import java.util.Arrays;

class ParallelMergeSort {

    void parallelMergeSort(int[] numbers, int numOfThreads) {

        if (numOfThreads <= 1) {
            mergeSort(numbers);
            return;
        }

        int middleIndex = numbers.length / 2;

        int[] leftSubarray = Arrays.copyOfRange(numbers, 0, middleIndex);
        int[] rightSubarray = Arrays.copyOfRange(numbers, middleIndex, numbers.length);

        Thread leftSorter = mergeSortThread(leftSubarray, numOfThreads);
        Thread rightSorter = mergeSortThread(rightSubarray, numOfThreads);

        leftSorter.start();
        rightSorter.start();

        try {
            leftSorter.join();
            rightSorter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        merge(leftSubarray, rightSubarray, numbers);
    }

    private Thread mergeSortThread(int[] numbers, int numOfThreads) {
        return new Thread(() -> parallelMergeSort(numbers, numOfThreads / 2));
    }

    private void mergeSort(int[] array) {

        if (array.length <= 1) {
            return;
        }

        int mid = array.length / 2;

        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }

    private void merge(int[] leftSubarray, int[] rightSubarray, int[] originalArray) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSubarray.length && j < rightSubarray.length) {
            if (leftSubarray[i] < rightSubarray[j]) {
                originalArray[k++] = leftSubarray[i++];
            } else {
                originalArray[k++] = rightSubarray[j++];
            }
        }

        while (i < leftSubarray.length) {
			originalArray[k++] = leftSubarray[i++];
		}

        while (j < rightSubarray.length) {
			originalArray[k++] = rightSubarray[j++];
		}
    }
}
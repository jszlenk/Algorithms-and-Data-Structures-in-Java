package MergeSort;

import java.util.stream.IntStream;

class MergeSort {

	private int[] originalArray;
	private int[] tempArray;

	MergeSort(int[] originalArray) {
		this.originalArray = originalArray;
		tempArray = new int[originalArray.length];
	}

	void parallelMergeSort(int low, int high, int numOfThreads) {

		if (numOfThreads <= 1) {
			mergeSort(low, high);
			return;
		}

		int middleIndex = (low + high) / 2;

		Thread leftSorter = mergeSortThread(low, middleIndex, numOfThreads);
		Thread rightSorter = mergeSortThread(middleIndex+1, high, numOfThreads);

		leftSorter.start();
		rightSorter.start();

		try {
			leftSorter.join();
			rightSorter.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		merge(low, middleIndex, high);
	}

	private Thread mergeSortThread(int low, int high, int numOfThreads) {
		return new Thread(() -> parallelMergeSort(low, high, numOfThreads / 2));
	}

	void mergeSort(int low, int high) {

		if (low >= high) {
			return;
		}

		int middle = (low + high) / 2;

		mergeSort(low, middle);
		mergeSort(middle + 1, high);
		merge(low, middle, high);
	}

	private void merge(int low, int middle, int high) {

		IntStream.rangeClosed(low, high).forEach(i -> tempArray[i] = originalArray[i]);

		int i = low;
		int j = middle + 1;
		int k = low;

		while ((i <= middle) && (j <= high)) {
			if (tempArray[i] <= tempArray[j]) {
				originalArray[k] = tempArray[i];
				i++;
			} else {
				originalArray[k] = tempArray[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			originalArray[k] = tempArray[i];
			k++;
			i++;
		}
	}
}
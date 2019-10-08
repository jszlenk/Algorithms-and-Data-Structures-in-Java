package MergeSort;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Throwable {

        int numOfThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of threads: " + numOfThreads);

        int size = 10000000;
        int[] numbers1 = createRandomArray(size);
        int[] numbers2 = new int[numbers1.length];
        int[] numbers3 = new int[numbers1.length];

        System.arraycopy(numbers1, 0, numbers2, 0, numbers1.length);
        System.arraycopy(numbers1, 0, numbers3, 0, numbers1.length);

        MergeSort parallelSorter = new MergeSort(numbers1);
        long start = System.currentTimeMillis();
        parallelSorter.parallelMergeSort(0, numbers1.length - 1, numOfThreads);
        long end = System.currentTimeMillis();
        System.out.printf("Time taken for " + size + " elements parallel improved merge sort algorithm =>  %6d ms \n", end - start);

        ParallelMergeSort parallelMergeSort = new ParallelMergeSort();
        start = System.currentTimeMillis();
        parallelMergeSort.parallelMergeSort(numbers2, numOfThreads);
        end = System.currentTimeMillis();
        System.out.printf("Time taken for " + size + " elements parallel original merge sort algorithm =>  %6d ms \n", end - start);

        MergeSort sequentisalSorted = new MergeSort(numbers3);
        start = System.currentTimeMillis();
        sequentisalSorted.mergeSort(0, numbers3.length - 1);
        end = System.currentTimeMillis();
        System.out.printf("Time taken for " + size + " elements sequential =>  %6d ms \n", end - start);
    }

    private static int[] createRandomArray(int size) {

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
package _Additional;

public class AlphabeticRadixSort {
    public static void main(String[] args) {
        String[] stringsArray = {"bcdef", "efakc", "abcde", "znaff", "bbeab"};

        radixSort(stringsArray, 26, 5);

        for (String aStringsArray : stringsArray) {
            System.out.println(aStringsArray);
        }
    }

    private static void radixSort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(String[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getIndex(position, value)]++;
        }

        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        System.arraycopy(temp, 0, input, 0, numItems);
    }

    private static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }
}

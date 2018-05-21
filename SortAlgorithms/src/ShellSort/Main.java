package ShellSort;

import static ShellSort.ShellSort.shell;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {25, 0, -8, -15, -4, 22, 7, 7, 1, -22, 14, 1};

        shell(intArray);

        for (int anIntArray : intArray) {
            System.out.println(anIntArray);
        }
    }
}

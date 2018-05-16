public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[6];

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 1;
        intArray[3] = 6;
        intArray[4] = 5;
        intArray[5] = 4;

        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 1) {
                index = i;
                break;
            }
        }

        System.out.println("Index = " + index);
    }
}

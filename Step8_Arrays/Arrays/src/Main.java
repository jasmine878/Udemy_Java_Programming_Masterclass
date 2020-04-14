public class Main {
    public static void main(String[] args) {
        int[] myIntArray1 = new int[10];

        myIntArray1[5] = 50;
        System.out.println(myIntArray1[5]);             //expect 50
        System.out.println();

        int[] myIntArray2 = {1, 2, 3, 4, 5, 6};
        System.out.println(myIntArray2[5]);             //expect 6
        System.out.println();

        int[] myIntArray3 = new int[10];

        for (int i = 0; i < myIntArray3.length; i++) {
            myIntArray3[i] = i * 10;
        }
        System.out.println(myIntArray3[5]);             //expect 50
        System.out.println();

        int[] myIntArray4 = new int[10];
        printArray(myIntArray4);
        System.out.println(myIntArray4[5]);             //expect 50
    }

    public static int[] printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }

        return array;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        printArray(sortIntegers(myIntegers));
    }

    public static int[] getIntegers(int arrayCapacity) {
        System.out.println("Enter " + arrayCapacity + " integer values.\r");

        int[] array = new int[arrayCapacity];

        for (int i = 0; i < arrayCapacity; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("There are " + array.length + " items in this array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " is at index " + i);
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean notSorted = true;

        while(notSorted) {
            notSorted = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                int num1 = sortedArray[i];
                int num2 = sortedArray[i + 1];

                if (num1 < num2) {
                    sortedArray[i] = num2;
                    sortedArray[i + 1] = num1;
                    notSorted = true;
                }
            }
        }

        return sortedArray;
    }


}

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
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
    }

    public static int[] sortIntegers(int[] array) {
        return array;
    }


}

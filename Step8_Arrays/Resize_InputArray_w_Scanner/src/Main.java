import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseArray = new int[5];

    public static void main(String[] args) {
        System.out.println("Enter 5 integers");
        getInput();
        printArray(baseArray);
        resizeArray();
    }

    private static void getInput() {
        for (int i = 0; i < baseArray.length; i++) {
            baseArray[i] = scanner.nextInt();
        }
        System.out.println();
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray() {
        int[] original = baseArray;

        baseArray = new int[7];
        System.out.println("Reinitialized array: " + Arrays.toString(baseArray));

        for (int i = 0; i < original.length; i++) {
            baseArray[i] = original[i];
        }

        System.out.println("Resized array after copy: " + Arrays.toString(baseArray));
    }
}

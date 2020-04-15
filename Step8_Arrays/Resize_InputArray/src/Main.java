import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseArray = new int[5];

    public static void main(String[] args) {
        getInput();
        printArray();
        resizeArray();
    }

    private static void getInput() {
        for (int i = 0; i < baseArray.length; i++) {
            System.out.println("Enter a number");
            baseArray[i] = scanner.nextInt();
        }
    }

    private static void printArray() {
        for (int i = 0; i < baseArray.length; i++) {
            System.out.println(baseArray[i]);
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

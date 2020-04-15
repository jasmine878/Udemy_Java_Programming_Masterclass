import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = readIntegers(5);
        System.out.println("the smallest value is: " + findMin(arr1));
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number");

            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        return array;
    }

    private static int findMin(int[] array) {
        int lowestValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];

            if (currentValue < lowestValue) lowestValue = currentValue;
        }

        return lowestValue;
    }
}

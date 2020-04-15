import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer values");
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array) {
        int lowestValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];

            if (currentValue < lowestValue) lowestValue = currentValue;
        }

        return lowestValue;
    }
}

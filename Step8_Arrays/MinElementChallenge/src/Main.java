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
}

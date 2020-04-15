import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseArray = new int[10];

    public static void main(String[] args) {
        getInput();
        printArray();
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

    
}

import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();

                if (counter == 0) {
                    min = number;
                    max = number;
                }

                if (number < min) min = number;
                if (number > max) max = number;
                counter++;
            } else break;
        }

        scanner.close();
        System.out.println("Minimum number entered was " + min + " and maximum number was " + max);
    }
}

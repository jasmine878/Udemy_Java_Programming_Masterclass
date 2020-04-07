import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
//            System.out.println("Please enter a number:  ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();

                sum += number;
                counter++;
            } else break;

            scanner.nextLine();
        }

        long avg;

        if (counter == 0) avg = 0;
        else {
//            System.out.println("SUM = " + sum);
//            System.out.println("Counter = " + counter);
            avg = Math.round((double) sum / (double) counter);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}

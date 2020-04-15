import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Sum of inputs is: " + sum);
    }


}

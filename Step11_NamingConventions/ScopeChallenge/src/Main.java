import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegularVariables regularVariables = new RegularVariables();

        System.out.println("Enter a number for the timesTable method");
        int number = scanner.nextInt();
        scanner.nextLine();

        regularVariables.timesTable(number);
    }
}

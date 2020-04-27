import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        RegularVariables regularVariables = new RegularVariables();
//
//        System.out.println("Enter a number for the timesTable method");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//
//        regularVariables.timesTable(number);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for the timesTable method");
        X x = new X(scanner.nextInt());

        x.x();
        scanner.close();

    }
}

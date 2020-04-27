import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //REGULAR TIMES TABLE CLASS
//        Scanner scanner = new Scanner(System.in);
//        RegularVariables regularVariables = new RegularVariables();
//
//        System.out.println("Enter a number for the timesTable method");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//
//        regularVariables.timesTable(number);
//        scanner.close();

        //TIMES TABLE CLASS WITH X AS THE VARIABLE NAMES ONLY
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number for the timesTable method");
//        X x = new X(scanner.nextInt());
//
//        x.x();
//        scanner.close();


        //TIMES TABLE CLASS WITH EVEN THE SCANNER INSTANCE NAMED X
        ScannerX x = new ScannerX(new Scanner(System.in));
        x.x();

    }
}

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    //a real world application would normally catch all exceptions in main method
    //instead of the divide method
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
            // we use a bitwise OR to check multiple exceptions
        } catch (ArithmeticException | NoSuchElementException error) {
            System.out.println(error.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }

    }

    private static int divide() {
        int x, y;

//        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
//        } catch (NoSuchElementException error) {
//            throw new NoSuchElementException("no suitable input");
//        } catch(ArithmeticException error) {
//            throw new ArithmeticException("attempt to divide by zero");
//        }
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer");

        //keep asking for input if the input type is invalid
        while(true) {
            try {
                return scanner.nextInt();
            } catch(InputMismatchException error) {
                //if error, try again.  but read past the end of line in the input first
                scanner.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9");
            }
        }


    }
}

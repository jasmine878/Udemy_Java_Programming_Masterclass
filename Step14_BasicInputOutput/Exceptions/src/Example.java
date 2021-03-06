import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x, y;

        try {
            x = getInt();
            y = getInt();

        } catch (NoSuchElementException error) {
            throw new ArithmeticException("no suitable input");
        }
        System.out.println("x is " + x + ", y is " + y);

        try {
            return x / y;
        } catch(ArithmeticException error) {
            throw new ArithmeticException("attempt to divide by zero");
        }
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

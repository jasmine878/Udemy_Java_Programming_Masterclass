import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 98;
        int y = 0;

        System.out.println(divideAttempt1(x, y));
        System.out.println(divideAttempt2(x, y));
//        System.out.println(divideError(x, y));
        System.out.println("=========================");

        int num1 = getIntLBYL();
        System.out.println("x is " + num1);
    }

    //lbyl - Look before you leap in coding
    //make sure we're not dividing a number by zero as this will cause an error
    private static int divideAttempt1(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    //eafp - ask for forgiveness than permission
    //use a try block to catch any exceptions that would cause an error
    private static int divideAttempt2(int x, int y) {
        try {
            return x / y;
        } catch(ArithmeticException error) {
            return 0;
        }
    }

    //dividing by 0 causes an error
//    private static int divideError(int x, int y) {
//        return x / y;
//    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");

        return scanner.nextInt();
    }

    //check the input to make sure it's a valid type
    //make the input a String and then check each character
    private static int getIntLBYL() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("please enter an integer");
        String input = scanner.next();

        //if input contains a non-digit value set isValid to false
        for (int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }

        //if valid, convert the input String to an integer and return
        if(isValid) {
            return Integer.parseInt(input);
        }

        return 0;
    }
}

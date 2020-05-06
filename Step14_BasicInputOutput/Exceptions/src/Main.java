public class Main {
    public static void main(String[] args) {
        int x = 98;
        int y = 0;

        System.out.println(divideAttempt1(x, y));
        System.out.println(divideAttempt2(x, y));
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
}

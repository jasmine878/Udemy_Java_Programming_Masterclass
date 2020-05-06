public class Main {
    public static void main(String[] args) {

    }

    //lbyl - Look before you leap in coding
    //make sure we're not dividing a number by zero as this will cause an error
    private static int divide(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }
}

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigit(125));              //expect 8
        System.out.println(sumDigit(1));                //expect -1
    }

    public static int sumDigit(int number) {
        if (number < 10) return -1;
        System.out.println("The sum of digits in " + number + " is: ");

        int remainingDigits = number;
        int sum = 0;
        int lastDigit = 0;

        while (remainingDigits > 0) {
            lastDigit = remainingDigits % 10;
            sum += lastDigit;
            remainingDigits /= 10;
        }

        return sum;
    }
}

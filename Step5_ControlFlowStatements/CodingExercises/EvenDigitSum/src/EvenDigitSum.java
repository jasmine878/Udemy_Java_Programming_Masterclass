public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int currentNumber = number;
        int currentDigit = 0;

        if (number < 0) return -1;

        while (currentNumber > 0) {
            currentDigit = currentNumber % 10;
            currentNumber /= 10;

            if (currentDigit % 2 == 0) sum += currentDigit;
        }

        return sum;
    }
}

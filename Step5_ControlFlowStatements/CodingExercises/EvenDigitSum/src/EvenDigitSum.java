public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));             //expect 20
        System.out.println(getEvenDigitSum(252));                   //expect 4
        System.out.println(getEvenDigitSum(-22));                   //expect -1
    }

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

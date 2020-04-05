public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number < 0) return -1;

        int currentNumber = number / 2;

        while (currentNumber > 1) {
            if (isPrime(currentNumber) && number % currentNumber == 0) {
//                System.out.println("Prime number is: " + currentNumber);
                return currentNumber;
            }
            currentNumber--;
        }

        return -1;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        int count = 2;

        while (count < number) {
            if (number % count == 0) return false;
            count++;
        }

        return true;
    }
}

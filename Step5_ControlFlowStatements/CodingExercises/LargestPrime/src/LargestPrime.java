public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number < 0) return -1;

        int currentNumber = number / 2;

        while (currentNumber > 1) {
//            System.out.println("currentNumber is:  " + currentNumber);
            if (number % currentNumber == 0) {
                int count = 2;
                boolean isPrime = true;

                while (count < currentNumber && isPrime == true) {
//                    System.out.println("count is " + count + " isPrime is " + isPrime);
                    if (currentNumber % count == 0) isPrime = false;
                    count++;
                }

                if (isPrime == true) {
//                    System.out.println("Prime number is: " + currentNumber);

                    return currentNumber;
                }
            }

            currentNumber--;
        }

        return -1;
    }
}

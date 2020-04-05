public class LargestPrime {
    public static void main(String[] args) {
//        System.out.println(isPrime(14));                //expect false;
//        System.out.println(isPrime(11));                //expect true;
//        System.out.println("\n");

        System.out.println(getLargestPrime(21));        //expect 7
        System.out.println(getLargestPrime(217));       //expect 31
        System.out.println(getLargestPrime(0));         //expect -1
        System.out.println(getLargestPrime(45));        //expect 5
        System.out.println(getLargestPrime(-1));        //expect -1
    }

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

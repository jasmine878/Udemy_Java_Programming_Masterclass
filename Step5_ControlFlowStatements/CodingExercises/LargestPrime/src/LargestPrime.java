public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(14));            //expect false;
        System.out.println(isPrime(11));             //expect true;
    }

//    public static int getLargestPrime(int number) {
//        if (number < 0) return -1;
//
//        int currentNumber = number / 2;
//    }

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

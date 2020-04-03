public class PrimeNumCount {
    public static void main(String[] args) {
        System.out.println(primesCount(2, 7));          //expect 3  (Primes:  2, 3, 5.... 7)
        System.out.println(primesCount(10, 50));        //expect 3
    }

    public static boolean isPrime(int n) {
        //a prime number is a whole number greater than 1
        if (n == 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static int primesCount(int num1, int num2) {
        int count = 0;

        for (int i = num1; i <= num2; i++) {
            if (count == 3) break;
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
            }
        }

        return count;
    }

}

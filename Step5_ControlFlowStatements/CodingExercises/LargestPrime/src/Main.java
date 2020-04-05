public class Main {
    public static void main(String[] args) {
//        System.out.println(LargestPrime.isPrime(14));                //expect false;
//        System.out.println(LargestPrime.isPrime(11));                //expect true;
//        System.out.println("\n");

        System.out.println(LargestPrime.getLargestPrime(21));        //expect 7
        System.out.println(LargestPrime.getLargestPrime(217));       //expect 31
        System.out.println(LargestPrime.getLargestPrime(0));         //expect -1
        System.out.println(LargestPrime.getLargestPrime(45));        //expect 5
        System.out.println(LargestPrime.getLargestPrime(-1));        //expect -1
        System.out.println(LargestPrime.getLargestPrime(7));         //expect 7
    }
}

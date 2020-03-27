package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Minimum Int value is: " + minIntValue);
        System.out.println("Maximum Int value is: " + maxIntValue);

        System.out.println("Busted MIN Int value is: " + (minIntValue - 1));
        System.out.println("Busted MAX Int value is: " + (maxIntValue + 1));
    }
}

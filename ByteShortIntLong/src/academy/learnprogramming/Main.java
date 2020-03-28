package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Minimum Int value is: " + minIntValue);
        System.out.println("Maximum Int value is: " + maxIntValue);

        System.out.println("Busted MIN Int value is: " + (minIntValue - 1));
        System.out.println("Busted MAX Int value is: " + (maxIntValue + 1));


        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte value is: " + minByteValue);
        System.out.println("Maximum Byte value is: " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short value is: " + minShortValue);
        System.out.println("Maximum Short value is: " + maxShortValue);
        
        long myLongValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        System.out.println("Minimum Long value is: " + minLongValue);
        System.out.println("Maximum Long value is: " + maxLongValue);

        int myTotal = minIntValue / 2;
        byte myNewByte = (byte) (minByteValue / 2);   //when we use a variable the default whole number used by Java is an int

        System.out.println(myTotal);
    }
}

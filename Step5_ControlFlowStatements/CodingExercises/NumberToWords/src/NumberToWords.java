public class NumberToWords {
    public static void main(String[] args) {
//        numberToWords(234);                     //expect Four, Three, Two
//        numberToWords(123);                     //expect Three, Two, One
//        numberToWords(1010);                    //expect Zero, One, Zero, One

//        System.out.println(getDigitCount(0));           //expect 1
//        System.out.println(getDigitCount(123));         //expect 3
//        System.out.println(getDigitCount(-12));         //expect -1
//        System.out.println(getDigitCount(5200));        //expect 4;

        System.out.println(reverse(-121));              //expect -121
        System.out.println(reverse(1212));              //expect 2121
        System.out.println(reverse(1234));              //expect 4321
        System.out.println(reverse(100));               //expect 1
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        else {
            int lastDigit = 0;
            int remainingDigits = number;

            while (remainingDigits > 0) {
                lastDigit = remainingDigits % 10;
                remainingDigits /= 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");

                }
            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int remainingDigits= number;
        int lastDigit = 0;

        if (number < 1) remainingDigits *= -1;

        while (remainingDigits > 0) {
            lastDigit = remainingDigits % 10;
            remainingDigits /= 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
        }
        if (number < 0) reversedNumber *= -1;

        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        int count = 0;
        int currentNumber = number;

        while (currentNumber > 0) {
            currentNumber /= 10;
            count++;
        }

        return count;
    }
}

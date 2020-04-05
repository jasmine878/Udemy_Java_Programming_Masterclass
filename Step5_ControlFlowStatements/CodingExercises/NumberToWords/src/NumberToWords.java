public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(234);                     //expect Four, Three, Two
        numberToWords(123);                     //expect Three, Two, One
        numberToWords(1010);                    //expect Zero, One, Zero, One
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
}

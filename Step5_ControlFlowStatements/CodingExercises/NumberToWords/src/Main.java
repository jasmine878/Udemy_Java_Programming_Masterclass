public class Main {

    public static void main(String[] args) {
        NumberToWords.numberToWords(234);                     //expect Two, Three, Four
        NumberToWords.numberToWords(123);                     //expect One, Two, Three
        NumberToWords.numberToWords(1010);                    //expect One, Zero, One, Zero
        NumberToWords.numberToWords(100);                     //expect One, Zero, Zero

        System.out.println(NumberToWords.getDigitCount(0));           //expect 1
        System.out.println(NumberToWords.getDigitCount(123));         //expect 3
        System.out.println(NumberToWords.getDigitCount(-12));         //expect -1
        System.out.println(NumberToWords.getDigitCount(5200));        //expect 4;

        System.out.println("\n");

        System.out.println(NumberToWords.reverse(-121));              //expect -121
        System.out.println(NumberToWords.reverse(1212));              //expect 2121
        System.out.println(NumberToWords.reverse(1234));              //expect 4321
        System.out.println(NumberToWords.reverse(100));               //expect 1
    }
}

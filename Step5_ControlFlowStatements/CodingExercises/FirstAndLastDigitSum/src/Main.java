public class Main {

    public static void main(String[] args) {
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(252));              //expect 4
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(257));              //expect 9
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(0));                //expect 0
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(5));                //expect 10
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(-10));              //expect -1
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(11));               //expect 2
    }
}

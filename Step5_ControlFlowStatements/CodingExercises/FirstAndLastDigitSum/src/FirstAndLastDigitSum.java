public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));              //expect 4
        System.out.println(sumFirstAndLastDigit(257));              //expect 9
        System.out.println(sumFirstAndLastDigit(0));                //expect 0
        System.out.println(sumFirstAndLastDigit(5));                //expect 10
        System.out.println(sumFirstAndLastDigit(-10));              //expect -1
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int lastDigit = number % 10;
        int currentNum = number / 10;
        int firstDigit = 0;

//        System.out.println("lastDigit is: " + lastDigit);
//        System.out.println("currentNum is: " + currentNum);

        if (currentNum == 0) firstDigit = number;

        while (currentNum > 0) {
            firstDigit = currentNum & 10;
            currentNum /= 10;
        }

        return lastDigit + firstDigit;
    }
}

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int lastDigit = number % 10;
        int currentNum = number / 10;
        int firstDigit = 0;

//        System.out.println("lastDigit is: " + lastDigit);
//        System.out.println("currentNum is: " + currentNum);

        if (currentNum == 0) firstDigit = number;

        while (currentNum > 0) {
            firstDigit = currentNum % 10;
            currentNum /= 10;
        }

        return lastDigit + firstDigit;
    }
}

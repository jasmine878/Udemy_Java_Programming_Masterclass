public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));            //expect true;
        System.out.println(isPalindrome(707));              //expect true;
        System.out.println(isPalindrome(11212));            //expect false;
    }

    public static boolean isPalindrome(int number) {
        if (number == 0) return false;

        int currentNum = Math.abs(number);
        int lastDigit;
        int reversedNum = 0;

        while (currentNum > 0) {
            lastDigit = currentNum % 10;
//            System.out.println("lastDigit is: " + lastDigit);
            reversedNum = reversedNum * 10 + lastDigit;
//            System.out.println("reversedNum is: " + reversedNum);
            currentNum /= 10;
//            System.out.println("currentNum is: " + currentNum);
        }

        if (number < 0) reversedNum *= -1;
        if (reversedNum == number) return true;

        return false;
    }
}

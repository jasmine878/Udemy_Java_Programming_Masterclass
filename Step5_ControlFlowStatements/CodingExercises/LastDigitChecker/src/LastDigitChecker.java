public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));            //expect true
        System.out.println(hasSameLastDigit(23, 32, 42));            //expect true
        System.out.println(hasSameLastDigit(9, 99, 999));            //expect false
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) return false;

        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        if (num1LastDigit == num2LastDigit || num1LastDigit == num3LastDigit || num2LastDigit == num3LastDigit) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) return true;

        return false;
    }
}

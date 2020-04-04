public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));                 //expect true
        System.out.println(hasSharedDigit(9, 99));                  //expect false
        System.out.println(hasSharedDigit(15, 55 ));                //expect true
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99) return false;
        if (num2 < 10 || num2 > 99) return false;

        int num1FirstDigit = num1 / 10;
        int num1SecondDigit = num1 % 10;

        int num2FirstDigit = num2 / 10;
        int num2SecondDigit = num2 % 10;

        if (num1FirstDigit == num2FirstDigit || num1FirstDigit == num2SecondDigit) return true;
        if (num1SecondDigit == num2FirstDigit || num1SecondDigit == num2SecondDigit) return true;

        return false;
    }
}

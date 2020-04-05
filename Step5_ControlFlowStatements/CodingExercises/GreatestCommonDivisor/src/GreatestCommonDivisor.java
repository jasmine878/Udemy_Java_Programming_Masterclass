public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));           //expect 5;
        System.out.println(getGreatestCommonDivisor(12, 30));           //expect 6;
        System.out.println(getGreatestCommonDivisor(9, 18));            //expect -1;
        System.out.println(getGreatestCommonDivisor(81, 153));          //expect 9;
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10) return -1;

        int divisor1 = num1 / 2;
        int divisor2 = num2 / 2;
        int currentNum;

        if (divisor1 >= divisor2) currentNum = divisor1;
        else currentNum = divisor2;

        while (currentNum > 1) {
            if (num1 % currentNum == 0 && num2 % currentNum == 0) {
                return currentNum;
            }

            currentNum -= 1;
        }

        return -1;
    }
}

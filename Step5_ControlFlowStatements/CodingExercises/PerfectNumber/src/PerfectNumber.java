public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int sum = 1;
        int currentNum = 2;

        while (currentNum <= number / 2) {
            if (number % currentNum == 0) sum += currentNum;
            currentNum++;
        }

        if (sum == number) return true;

        return false;
    }
}

public class Series {
    public Series() {

    }

    //result:    0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55
    //      n  = 0, 1, 2, 3,  4,  5,  6,  7,  8,  9, 10
    //0 + 1 = 1
    //1 + 2 = 3
    //3 + 3 = 6
    //6 + 4 = 10
    //10 + 5 = 15
    //15 + 6 = 21
    //21 + 7 = 28
    //28 + 8 = 36
    //36 + 9 = 45
    //45 + 10 = 55
    public static int nSum(int n) {
        if (n == 0) return 0;

        int result = 0;
        int i = 1;

        while (n >= i) {
            result += i;
            i++;
        }

        return result;
    }

    //result:    0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
    //      n  = 0, 1, 2, 3,  4,   5,   6,    7,     8,      9,      10
    //1 * 1 = 1
    //1 * 2 = 2
    //2 * 3 = 6
    //6 * 4 = 24
    //24 * 5 = 120
    //120 * 6 = 720
    //720 * 7 = 5040
    //5040 * 8 = 40320
    //40320 * 9 = 362880
    //362880 * 10 = 2628800
    public static int factorial(int n) {
        if (n == 0) return 0;

        int result = 1;
        int i = 1;

        while (n >= i) {
            result *= i;
            i++;
        }

        return result;
    }

    //result:    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    //      n  = 0, 1, 2, 3, 4, 5, 6,  7,  8,  9, 10
    //0
    //1
    //1
    //2
    //2 + 1 = 3
    //3 + 2 = 5
    //5 + 3 = 8
    //8 + 5 = 13
    //13 + 8 = 21
    //21 + 13 = 34
    //34 + 21 = 55
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        int i = 1;

        while (n > i) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }

        return sum;
    }

}

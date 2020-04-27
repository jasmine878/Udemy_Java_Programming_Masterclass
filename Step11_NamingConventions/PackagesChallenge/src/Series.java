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

}

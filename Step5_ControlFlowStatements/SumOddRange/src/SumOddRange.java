public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));                 //expect 2500
        System.out.println(sumOdd(-1, 100));                //expect -1
        System.out.println(sumOdd(100, 100));               //expect 0
        System.out.println(sumOdd(13, 13));                 //expect 13
        System.out.println(sumOdd(100, -100));              //expect -1
        System.out.println(sumOdd(100, 1000));              //expect 247500
        System.out.println(sumOdd(10, 5));                  //expect -1
    }

    public static boolean isOdd(int number) {
        if (number <= 0) return false;
        if (number % 2 == 1) return true;

        return false;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0) return -1;
        if (start > end) return -1;

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) sum += i;
        }

        return sum;
    }
}

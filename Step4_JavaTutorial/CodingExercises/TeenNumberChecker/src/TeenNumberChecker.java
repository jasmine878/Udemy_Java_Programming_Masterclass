public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));;                 //expect true
        System.out.println(hasTeen(23, 15, 42));;                //expect true
        System.out.println(hasTeen(22, 23, 34));;                //expect false

        System.out.println(isTeen(9));                      //expect false
        System.out.println(isTeen(13));                     //expect true
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (isTeen(num1) || isTeen(num2) || isTeen(num3)) return true;

        return false;
    }

    public static boolean isTeen(int num) {
        if (num >= 13 && num <= 19) return true;

        return false;
    }
}

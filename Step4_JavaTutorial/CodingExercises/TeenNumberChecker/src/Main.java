public class Main {
    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));;                 //expect true
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));;                //expect true
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));;                //expect false

        System.out.println(TeenNumberChecker.isTeen(9));                      //expect false
        System.out.println(TeenNumberChecker.isTeen(13));                     //expect true
    }
}

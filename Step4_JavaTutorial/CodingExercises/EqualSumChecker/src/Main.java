public class Main {
    public static void main(String[] args) {
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));                   //expect false
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));                   //expect true
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));                  //expect true
    }
}

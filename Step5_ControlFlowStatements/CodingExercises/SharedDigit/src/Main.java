public class Main {
    public static void main(String[] args) {
        System.out.println(SharedDigit.hasSharedDigit(12, 23));                 //expect true
        System.out.println(SharedDigit.hasSharedDigit(9, 99));                  //expect false
        System.out.println(SharedDigit.hasSharedDigit(15, 55 ));                //expect true
    }
}

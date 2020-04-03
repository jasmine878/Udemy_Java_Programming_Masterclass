public class Main {
    public static void main(String[] args) {
        System.out.println(SumOddRange.sumOdd(1, 100));                 //expect 2500
        System.out.println(SumOddRange.sumOdd(-1, 100));                //expect -1
        System.out.println(SumOddRange.sumOdd(100, 100));               //expect 0
        System.out.println(SumOddRange.sumOdd(13, 13));                 //expect 13
        System.out.println(SumOddRange.sumOdd(100, -100));              //expect -1
        System.out.println(SumOddRange.sumOdd(100, 1000));              //expect 247500
        System.out.println(SumOddRange.sumOdd(10, 5));                  //expect -1
    }
}

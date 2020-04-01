public class Main {
    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));              //expect true
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));                 //expect false
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.176, 3.175));                 //expect false
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));                     //expect true
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));                //expect false
    }
}

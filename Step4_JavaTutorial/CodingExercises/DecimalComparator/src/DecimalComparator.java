public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));              //expect true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));                 //expect false
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));                 //expect false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));                     //expect true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));                //expect false
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double difference = Math.abs(num1 - num2);
//        System.out.println("difference = " + difference);

        if (difference < .0009) return true;
        return false;
    }
}

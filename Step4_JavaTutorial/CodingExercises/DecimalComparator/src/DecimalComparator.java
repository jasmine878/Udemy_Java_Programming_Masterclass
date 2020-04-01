public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double difference = Math.abs(num1 - num2);
//        System.out.println("difference = " + difference);

        if (difference < .0009) return true;
        return false;
    }
}

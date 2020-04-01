public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(12, 0));         //expect 365.76cm
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) return -1;

        return (feet * 12 + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) return -1;

        double feet = Math.floor(inches / 12);
        double remainingInches = inches - feet * 12;

        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

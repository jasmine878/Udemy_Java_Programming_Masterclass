public class MethodOverloading {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(12, 0);         //expect 365.76cm
        calcFeetAndInchesToCentimeters(6, 0);          //expect 182.88cm
        calcFeetAndInchesToCentimeters(7, 5);          //expect 226.06cm
        calcFeetAndInchesToCentimeters(-10, 1);         //expect -1
        calcFeetAndInchesToCentimeters(0, 1);           //expect 2.54cm
        calcFeetAndInchesToCentimeters(6, -10);         //expect -1
        calcFeetAndInchesToCentimeters(6, 13);          //expect -1
        calcFeetAndInchesToCentimeters(100);                        //expect 254.0cm
        calcFeetAndInchesToCentimeters(156);                        //expect 396.24cm
        calcFeetAndInchesToCentimeters(157);                        //expect 398.78cm
        calcFeetAndInchesToCentimeters(-10);                        //expect -1
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameters");

            return -1;
        }

        double centimeters =  (feet * 12 + inches) * 2.54;

        System.out.println(feet + " feet " + inches + " inches equals " + centimeters);

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches parameter");

            return -1;
        }

//        double feet = Math.floor(inches / 12);
//        double remainingInches = inches - feet * 12;

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

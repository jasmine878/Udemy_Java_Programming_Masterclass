public class SpeedConverter {
//    public static void main(String[] args) {
////        System.out.println(toMilesPerHour(1.5));                //expect 1
////        System.out.println(toMilesPerHour(10.25));              //expect 6
////        System.out.println(toMilesPerHour(-5.6));               //expect -1
////        System.out.println(toMilesPerHour(25.42));              //expect 16
////        System.out.println(toMilesPerHour(75.114));             //expect 47
////
////        printConversion(1.5);                     //expect 1.5 km/h = 1 mi/h
////        printConversion(10.25);                   //expect 10.25 km/h = 6 mi/h
////        printConversion(-5.6);                    //expect Invalid Value
////        printConversion(25.42);                   //expect 25.42 km/h = 16 mi/h
////        printConversion(75.114);                  //expect 75.114 km/h = 47 mi/h
////    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) System.out.println("Invalid Value");
        else {
            long mph = toMilesPerHour((kilometersPerHour));

            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(SpeedConverter.toMilesPerHour(1.5));                //expect 1
        System.out.println(SpeedConverter.toMilesPerHour(10.25));              //expect 6
        System.out.println(SpeedConverter.toMilesPerHour(-5.6));               //expect -1
        System.out.println(SpeedConverter.toMilesPerHour(25.42));              //expect 16
        System.out.println(SpeedConverter.toMilesPerHour(75.114));             //expect 47

        SpeedConverter.printConversion(1.5);                     //expect 1.5 km/h = 1 mi/h
        SpeedConverter.printConversion(10.25);                   //expect 10.25 km/h = 6 mi/h
        SpeedConverter.printConversion(-5.6);                    //expect Invalid Value
        SpeedConverter.printConversion(25.42);                   //expect 25.42 km/h = 16 mi/h
        SpeedConverter.printConversion(75.114);                  //expect 75.114 km/h = 47 mi/h
    }
}

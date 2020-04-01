public class Main {
    public static void main(String[] args) {
        System.out.println(LeapYearCalculator.isLeapYear(1600));                   //expect true
        System.out.println(LeapYearCalculator.isLeapYear(2000));                   //expect true
        System.out.println(LeapYearCalculator.isLeapYear(2400));                   //expect true

        System.out.println(LeapYearCalculator.isLeapYear(1700));                   //expect false
        System.out.println(LeapYearCalculator.isLeapYear(1800));                   //expect false
        System.out.println(LeapYearCalculator.isLeapYear(1900));                   //expect false
        System.out.println(LeapYearCalculator.isLeapYear(2100));                   //expect false
        System.out.println(LeapYearCalculator.isLeapYear(2200));                   //expect false
        System.out.println(LeapYearCalculator.isLeapYear(2300));                   //expect false
        System.out.println(LeapYearCalculator.isLeapYear(2500));                   //expect false
        System.out.println(LeapYearCalculator.isLeapYear(2600));                   //expect false
        System.out.println(LeapYearCalculator.isLeapYear(-1600));                  //expect false
        System.out.println(LeapYearCalculator.isLeapYear(2017));                   //expect false

        System.out.println(LeapYearCalculator.isLeapYear(1924));                   //expect true
    }
}

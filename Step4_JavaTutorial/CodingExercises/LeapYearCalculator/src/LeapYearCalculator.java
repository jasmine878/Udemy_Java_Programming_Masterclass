public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));                   //expect true
        System.out.println(isLeapYear(2000));                   //expect true
        System.out.println(isLeapYear(2400));                   //expect true

        System.out.println(isLeapYear(1700));                   //expect false
        System.out.println(isLeapYear(1800));                   //expect false
        System.out.println(isLeapYear(1900));                   //expect false
        System.out.println(isLeapYear(2100));                   //expect false
        System.out.println(isLeapYear(2200));                   //expect false
        System.out.println(isLeapYear(2300));                   //expect false
        System.out.println(isLeapYear(2500));                   //expect false
        System.out.println(isLeapYear(2600));                   //expect false
        System.out.println(isLeapYear(-1600));                  //expect false
        System.out.println(isLeapYear(2017));                   //expect false
    }

     public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) return true;
        else if ((year % 4 == 0) && (year % 100 != 0)) return true;

        return false;
     }
}

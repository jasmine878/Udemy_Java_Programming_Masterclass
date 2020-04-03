public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));          //expect false
        System.out.println(isLeapYear(1600));           //expect true
        System.out.println(isLeapYear(2017));           //expect false
        System.out.println(isLeapYear(2000));           //expect true
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;

        if (year % 4 == 0 && year % 100 != 0) return true;
        if (year % 400 == 0) return true;

        return false;
    }
}

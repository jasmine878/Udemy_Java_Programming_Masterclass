public class Main {

    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));          //expect false
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));           //expect true
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));           //expect false
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));           //expect true

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));        //expect 31
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));        //expect 29
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));        //expect 28
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));       //expect -1
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));       //expect -1
    }
}

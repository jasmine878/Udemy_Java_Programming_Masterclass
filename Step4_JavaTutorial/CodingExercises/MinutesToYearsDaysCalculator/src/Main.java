public class Main {
    public static void main(String[] args) {
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);                          //expect 1 y and 0 d
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);                         //expect 2 y and 0 d
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);                          //expect 1 y and 25 d
        MinutesToYearsDaysCalculator.printYearsAndDays(-525600);                         //expect Invalid value
    }
}

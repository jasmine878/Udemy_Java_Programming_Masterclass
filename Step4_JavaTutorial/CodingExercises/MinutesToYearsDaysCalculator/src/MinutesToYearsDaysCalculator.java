public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);                          //expect 1 y and 0 d
        printYearsAndDays(1051200);                         //expect 2 y and 0 d
        printYearsAndDays(561600);                          //expect 1 y and 25 d
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println("Invalid value");

        long days = minutes / (60 * 24);
        long years = days / 365;
        long remainingDays = days - years * 365;

        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
}

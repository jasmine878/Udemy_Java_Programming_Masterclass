public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(4);               //expect Thursday
        printDayOfTheWeek(9);               //expect Invalid day
        printDayOfTheWeek(-1);              //expect Invalid day
        printDayOfTheWeek(0);               //expect Sunday
    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

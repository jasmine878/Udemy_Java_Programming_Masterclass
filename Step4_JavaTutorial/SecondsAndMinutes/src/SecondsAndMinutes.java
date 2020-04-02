public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));       //expect 01h 01m 00s
        System.out.println(getDurationString(301));                 //expect 00h 05m 01s
        System.out.println(getDurationString(3600));                //expect 01h 00m 00s
        System.out.println(getDurationString(65, 45));      //expect 01h 05m 45s
        System.out.println(getDurationString(3945));                //expect 01h 05m 45s
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid value";

        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        String timeToString = "";

//        return hour + "h " + remainingMinutes + "m " + seconds + "s";

        if (hour < 10) timeToString += "0";
        timeToString += hour + "h ";

        if (remainingMinutes < 10) timeToString += "0";
        timeToString += remainingMinutes + "m ";

        if (seconds < 10) timeToString += "0";
        timeToString += seconds + "s";

        return timeToString;
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) return "Invalid value";

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}

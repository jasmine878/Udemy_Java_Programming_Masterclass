public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));         //expect false
        System.out.println(isCatPlaying(false, 36));        //expect false
        System.out.println(isCatPlaying(false, 35));        //expect true
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true && temperature >= 25 && temperature <= 45) return true;
        if (temperature >= 25 && temperature <= 35) return true;

        return false;
    }
}

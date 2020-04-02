public class Main {
    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlaying(true, 10));         //expect false
        System.out.println(PlayingCat.isCatPlaying(false, 36));        //expect false
        System.out.println(PlayingCat.isCatPlaying(false, 35));        //expect true
    }
}

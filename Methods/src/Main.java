public class Main {

    public static void main(String[] args) {
        
        calculateScore(true, 5_000, 5, 100);

        calculateScore(true, 10_000, 8, 200);
    }

    public static void calculateScore( boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;

            System.out.println("Your final score was " + finalScore);
        }
    }
}

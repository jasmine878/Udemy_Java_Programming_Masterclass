public class IfKeywordAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5_000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000)
            System.out.println("Your score was 5000");

        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;

            System.out.println("Your final score was " + finalScore);
        }

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("Your final score was " + (score + levelCompleted * bonus));
    }
}

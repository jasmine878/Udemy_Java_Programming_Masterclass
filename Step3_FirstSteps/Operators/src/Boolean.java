public class Boolean {
    public static void main(String[] args) {
        boolean isAlien = false;

        if(isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 100;
        if(topScore != 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore <= 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        System.out.println("What is wasCar?l " + wasCar);
    }
}

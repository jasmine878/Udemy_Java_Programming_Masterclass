public class AllFactors {

    public static void printFactors(int number) {
        System.out.println("The Factors of " + number + " are: ");
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int currentNum = 1;

            while (currentNum <= number) {
                if (number % currentNum == 0) System.out.println(currentNum);
                currentNum ++;
            }
        }
        System.out.println("\n");
    }
}

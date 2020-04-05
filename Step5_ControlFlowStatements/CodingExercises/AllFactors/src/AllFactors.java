public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);                    //expect 1, 2, 3, 6
        printFactors(32);                   //expect 1, 2, 4, 8, 16, 32
        printFactors(10);                   //expect 1, 2, 5, 10
        printFactors(-1);                   //expect -1
    }

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

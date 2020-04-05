public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);                    //expect 1, 2, 3, 6
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int currentNum = 1;

            while (currentNum <= number) {
                if (number % currentNum == 0) System.out.println(currentNum);
                currentNum ++;
            }
        }

    }
}

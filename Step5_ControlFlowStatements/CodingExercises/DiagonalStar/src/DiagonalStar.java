public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) System.out.println("Invalid Value");
        else {
            boolean printStar = false;

            for (int row = 1; row <= number; row++) {
                for (int col = 1; col <= number; col++) {
                    if (row == 1 || row == number) printStar = true;
                    if (col == 1 || col == number) printStar = true;
                    if (row == col) printStar = true;
                    if (col == number - row + 1) printStar = true;

                    if (printStar == true) {
                        System.out.print("*");
                        printStar = false;
                    } else System.out.print(" ");
                }
                if (row < number) System.out.println();
            }
        }
    }
}

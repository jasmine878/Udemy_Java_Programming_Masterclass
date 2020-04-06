public class Main {
    public static void main(String[] args) {
        DiagonalStar.printSquareStar(5);
        //expect
        //          *****
        //          ** **
        //          * * *
        //          ** **
        //          *****

        System.out.println();

        DiagonalStar.printSquareStar(8);
        //expect
        //          ********
        //          **    **
        //          * *  * *
        //          *  **  *
        //          *  **  *
        //          * *  * *
        //          **    **
        //          ********
    }
}

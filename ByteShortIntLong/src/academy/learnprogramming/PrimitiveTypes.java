package academy.learnprogramming;

public class PrimitiveTypes {

    public static void main(String[] args) {
        byte byteNum = 100;
        short shortNum = 30_000;
        int intNum = 1_000_000_000;

        long longNum = 50_000L + 10L * (byteNum + shortNum + intNum);

        System.out.println("Primitive Types Challenge Total is: " + longNum);
    }
}

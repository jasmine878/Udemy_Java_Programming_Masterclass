public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);                        //expect "All numbers are equal"
        printEqual(1, 1, 2);                        //expect "Neither all are equal or different"
        printEqual(-1, -1, -1);                     //expect "Invalid Value"
        printEqual(1, 2, 3);                        //expect "All numbers are different"
    }

    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) System.out.println("Invalid Value");
        else if (num1 == num2 && num1 == num3 && num2 == num3 ) System.out.println("All numbers are equal");
        else if (num1 != num2 && num1 != num3 && num2 != num3) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }
}

public class Main {
    public static void main(String[] args) {
        EqualityPrinter.printEqual(1, 1, 1);                        //expect "All numbers are equal"
        EqualityPrinter.printEqual(1, 1, 2);                        //expect "Neither all are equal or different"
        EqualityPrinter.printEqual(-1, -1, -1);                     //expect "Invalid Value"
        EqualityPrinter.printEqual(1, 2, 3);                        //expect "All numbers are different"
    }
}

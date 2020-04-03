public class isEvenNumber {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(40));               //expect true
        System.out.println(isEvenNumber(11));               //expect false
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) return true;

        return false;
    }
}

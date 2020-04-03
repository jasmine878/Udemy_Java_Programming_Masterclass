public class WhileLoop {
    public static void main(String[] args) {
//        int count = 1;
//
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        System.out.println("\n");
//        count = 1;
//
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while(count != 6);
//
        int start = 4;
        int finishNumber = 20;

        while (start <= finishNumber) {

            if (isEvenNumber(start)) {
                System.out.println(start + " is an even number");
            }

            start++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) return true;

        return false;
    }

}

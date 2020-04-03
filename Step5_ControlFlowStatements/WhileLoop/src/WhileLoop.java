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
        int count = 0;

        while (start <= finishNumber) {
            if (count == 5) break;
            
            if (isEvenNumber(start)) {
                System.out.println(start + " is an even number");
                count++;
            }

            start++;
        }

        System.out.println("Total number of even numbers is " + count);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) return true;

        return false;
    }

}

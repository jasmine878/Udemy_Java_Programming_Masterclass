public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);                              //expect 3

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);             //expect 3

        result = result - 1;
        System.out.println("3 - 1 = " + result);                              //expect 2

        System.out.println("previousResult = " + previousResult);             //expect 3

        result = result * 10;
        System.out.println("2 * 10 = " + result);                             //expect 20

        result = result / 5;
        System.out.println("20 / 5 = " + result);                            //expect 4

        result = result % 3;
        System.out.println("4 % 3 = " + result);                             //expect 1

        result++;
        System.out.println("1 + 1 = " + result);                            //expect 2

        result--;
        System.out.println("2 - 1 = " + result);                            //expect 1

        result += 2;
        System.out.println("1 + 2 = " + result);                            //expect 3

        result *= 10;
        System.out.println("3 * 10 = " + result);                           //expect 30

        result /= 3;
        System.out.println("30 / 3 = " + result);                           //expect 10

        result -= 2;
        System.out.println("10 - 2 = " + result);                           //expect 8
    }
}

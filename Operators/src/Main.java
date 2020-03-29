public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);                              //expect 3

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);             //expect 3

        result = result - 1;
        System.out.println("3 - 1 = " + result);                              //expect 2

        System.out.println("previousResult = " + previousResult);             //expect 3
    }
}

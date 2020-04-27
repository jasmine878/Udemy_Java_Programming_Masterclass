

public class Main {
    public static void main(String[] args) {
        System.out.println("Results for nSum method");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
        System.out.println("============================");

        System.out.println("Results for factorial method");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("============================");

        System.out.println("Results for fibonacci method");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}

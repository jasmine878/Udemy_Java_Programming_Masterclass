public class OperatorChallenge {
    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 80.00;
        double result = (num1 + num2) * 100.00;
        System.out.println("The Total Value is " + result);                 //expect 10,000

        result = result % 40.00;
        System.out.println("The remainder is " + result);                   //expect 0

        boolean isRemainderZero = result == 0 ? true : false;
        System.out.println("isRemainderZero = " + isRemainderZero);         //expect true

        if (!isRemainderZero) {
            System.out.println("Got some remainder");                       //expect blank
        }
    }
}

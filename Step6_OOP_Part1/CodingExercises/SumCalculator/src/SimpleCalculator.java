public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("add= " + calculator.getAdditionResult());           //expect add= 9.0
        System.out.println("subtract= " + calculator.getSubtractionResult());   //expect 1.0

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("multiply= " + calculator.getMultiplicationResult());   //expect 0.0
        System.out.println("divide= " +calculator.getDivisionResult());            //expect 0.0
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setFirstNumber(double number) {
        this.firstNumber = number;
    }

    public void setSecondNumber(double number) {
        this.secondNumber = number;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        if (this. secondNumber == 0) return 0;

        return this.firstNumber / this.secondNumber;
    }
}

public class Printer {
    private double tonerLevel;
    private int numberPagesPrinted;
    private boolean duplex;

    public Printer(double tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberPagesPrinted = 0;
        this.duplex = duplex;
    }

    public static void main(String[] args) {

    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public void fillToner(double addedToner) {
        tonerLevel += addedToner;

        if (getTonerLevel() > 100) tonerLevel = 100;
    }

    public void printPage(int number) {
        int count = 0;

        while (count < number) {
            if (getTonerLevel() > 0) {
                numberPagesPrinted++;
                tonerLevel -= 10;
            } else {
                System.out.println("There is not enough toner to print");
                break;
            }
        }
    }
}

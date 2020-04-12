public class Printer {
    private double tonerLevel;
    private int numberPagesPrinted;
    private boolean duplex;

    public Printer(double tonerLevel, int numberPagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.numberPagesPrinted = numberPagesPrinted;
        this.duplex = duplex;
    }

    public static void main(String[] args) {

    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public void fillToner(double addedToner) {
        tonerLevel += addedToner;

        if (getTonerLevel() > 1) tonerLevel = 1;
    }

    public void printPage(int number) {
        int count = 0;

        while (count < number) {
            if (getTonerLevel() > 0) {
                numberPagesPrinted++;
                tonerLevel -= .1;
            } else {
                System.out.println("There is not enough toner to print");
                break;
            }
        }
    }
}

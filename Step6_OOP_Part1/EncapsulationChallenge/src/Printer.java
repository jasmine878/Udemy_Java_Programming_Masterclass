public class Printer {
    private int tonerLevel;
    private int numberPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberPagesPrinted = 0;
        this.duplex = duplex;
    }

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getNumberPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getNumberPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getNumberPagesPrinted());
        System.out.println();

        Printer printer2 = new Printer(50, false);
        System.out.println("initial page count = " + printer2.getNumberPagesPrinted());

        pagesPrinted = printer2.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer2.getNumberPagesPrinted());

        pagesPrinted = printer2.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer2.getNumberPagesPrinted());
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPagesPrinted() {
        return numberPagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 0 || tonerAmount > 100) return -1;
        if (tonerLevel + tonerAmount > 100) return -1;

        this.tonerLevel += tonerAmount;

        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.duplex) {
            pagesToPrint = (int) Math.ceil(pagesToPrint / 2);
            System.out.println("Printing in duplex mode");
        }

        this.numberPagesPrinted += pagesToPrint;

        return pagesToPrint;
    }
}

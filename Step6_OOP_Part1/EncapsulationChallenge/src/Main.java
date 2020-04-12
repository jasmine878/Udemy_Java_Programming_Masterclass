public class Main {
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
}

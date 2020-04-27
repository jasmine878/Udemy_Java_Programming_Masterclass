//Change program so that even the scanner instance is named x

import java.util.Scanner;

public class ScannerX {
    private int x;

    public ScannerX(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public void x() {
        System.out.println("Times table for " + x + ": ");
        for (int x = 1;x <= 12; x++) {
            System.out.println(this.x + " multiplied by " + x + " equals " + this.x * x);
        }
        System.out.println("===============================");
    }
}


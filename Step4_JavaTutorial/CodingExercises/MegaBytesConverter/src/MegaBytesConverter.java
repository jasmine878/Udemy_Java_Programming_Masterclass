public class MegaBytesConverter {
//    public static void main(String[] args) {
//        printMegaBytesAndKiloBytes(2500);                       //expect 2500 KB = 2 MB and 452 KB
//        printMegaBytesAndKiloBytes(-1024);                      //expect Invalid Value
//        printMegaBytesAndKiloBytes(5000);                       //expect 5000 KB = 4 MB and 904 KB
//    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) System.out.println("Invalid Value");
        else {
            int megaBytes = (int) Math.round(Math.floor(kiloBytes / 1024));
            int remainingKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}

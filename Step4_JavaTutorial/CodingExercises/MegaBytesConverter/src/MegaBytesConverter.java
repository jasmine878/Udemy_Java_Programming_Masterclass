public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);                       //expect 2 and 452
        printMegaBytesAndKiloBytes(-1024);                      //expect Invalid Value
        printMegaBytesAndKiloBytes(5000);                       //expect 4 and 904
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) System.out.println("Invalid Value");
        else {
            int megaBytes = (int) Math.round(Math.floor(kiloBytes / 1024));
            int remainingKiloBytes = kiloBytes % 1024;

            System.out.println(megaBytes + " and " + remainingKiloBytes);
        }
    }
}

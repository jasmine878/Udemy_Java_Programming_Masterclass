public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);                       //expect 2
        printMegaBytesAndKiloBytes(-1024);                      //expect 0
        printMegaBytesAndKiloBytes(5000);                       //expect 4
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) System.out.println("Invalid Value");
        else {
            long megaBytes = Math.round(Math.floor(kiloBytes / 1024));

            System.out.println(megaBytes);
        }

    }
}

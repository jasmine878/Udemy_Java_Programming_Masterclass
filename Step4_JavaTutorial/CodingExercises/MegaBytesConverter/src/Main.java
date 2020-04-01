public class Main {
    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);                       //expect 2500 KB = 2 MB and 452 KB
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);                      //expect Invalid Value
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);                       //expect 5000 KB = 4 MB and 904 KB
    }
}

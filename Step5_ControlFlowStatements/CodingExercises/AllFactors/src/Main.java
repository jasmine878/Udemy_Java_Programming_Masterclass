public class Main {
    public static void main(String[] args) {
        AllFactors.printFactors(6);                    //expect 1, 2, 3, 6
        AllFactors.printFactors(32);                   //expect 1, 2, 4, 8, 16, 32
        AllFactors.printFactors(10);                   //expect 1, 2, 5, 10
        AllFactors.printFactors(-1);                   //expect -1
    }
}

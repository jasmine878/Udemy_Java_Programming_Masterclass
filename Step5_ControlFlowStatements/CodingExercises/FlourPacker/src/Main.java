public class Main {

    public static void main(String[] args) {
        System.out.println(FlourPacker.canPack(1, 0, 4));               //expect false;
        System.out.println(FlourPacker.canPack(1, 0, 5));               //expect true;
        System.out.println(FlourPacker.canPack(0, 5, 4));               //expect true;
        System.out.println(FlourPacker.canPack(2, 2, 11));              //expect true
        System.out.println(FlourPacker.canPack(-3, 2, 12));             //expect false;
        System.out.println(FlourPacker.canPack(2, 1, 5));               //expect true;
    }
}

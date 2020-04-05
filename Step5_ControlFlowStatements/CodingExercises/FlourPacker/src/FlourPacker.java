public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));               //expect false;
        System.out.println(canPack(1, 0, 5));               //expect true;
        System.out.println(canPack(0, 5, 4));               //expect true;
        System.out.println(canPack(2, 2, 11));              //expect true
        System.out.println(canPack(-3, 2, 12));             //expect false;
        System.out.println(canPack(2, 1, 5));               //expect true;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0) return false;

       for (int i = 0; i <= bigCount; i++) {
           for (int j = 0; j <= smallCount; j++) {
               if (i * 5 + j == goal) return true;
           }
       }

        return false;
    }
}

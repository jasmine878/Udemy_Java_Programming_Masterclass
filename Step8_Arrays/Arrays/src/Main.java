public class Main {
    public static void main(String[] args) {
        int[] myIntArray1 = new int[10];

        myIntArray1[5] = 50;
        System.out.println(myIntArray1[5]);             //expect 50
        System.out.println();

        int[] myIntArray2 = {1, 2, 3, 4, 5, 6};
        System.out.println(myIntArray2[5]);             //expect 6
    }
}

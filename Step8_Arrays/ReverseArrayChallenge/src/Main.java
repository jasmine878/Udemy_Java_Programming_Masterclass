import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        reverse(array1);
        System.out.println();

//        int[] array2 = {55, 20, 1, 33, 17};
//        reverse(array2);
    }

    private static void reverse(int[] array) {
        int[] reversedArr = new int[array.length];
        int swappedIndex = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            reversedArr[i] = array[swappedIndex];
            swappedIndex--;
            System.out.println(Arrays.toString(reversedArr));
        }
        System.out.println("Original array is: " + Arrays.toString(array));
        System.out.println("Reversed array is: " + Arrays.toString(reversedArr));
    }
}

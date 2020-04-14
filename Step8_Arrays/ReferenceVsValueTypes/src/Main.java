import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue = " + myIntValue);                       //expect 10
        System.out.println("anotherIntValue = " + anotherIntValue);             //expect 10
        System.out.println();

        anotherIntValue = 20;
        System.out.println("myIntValue = " + myIntValue);                       //expect 10
        System.out.println("anotherIntValue = " + anotherIntValue);             //expect 20
        System.out.println();

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));      //expect [0, 0, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));  //expect [0, 0, 0, 0, 0]
        System.out.println();

        anotherArray[0] = 10;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));      //expect [10, 0, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));  //expect [10, 0, 0, 0, 0]
        System.out.println();

        modifyArray(myIntArray);
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));      //expect [10, 20, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));  //expect [10, 20, 0, 0, 0]
        System.out.println();

        modifyArray2(myIntArray);
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));      //expect [10, 20, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));  //expect [10, 20, 0, 0, 0]
        System.out.println();

        anotherArray = new int[] {4, 5, 6, 7, 8};
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));      //expect [10, 0, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));  //expect [4, 5, 6, 7, 8]
        System.out.println();
    }

    //modifies the passing array
    private static void modifyArray(int[] array) {
        array[1] = 20;
        System.out.println("The parameter array = " + Arrays.toString(array));
    }

    //does not modify the passing array.  only reassigns the parameter
    private static void modifyArray2(int[] array) {
        array = new int[] {1, 2, 3, 4, 5};
        System.out.println("The parameter array = " + Arrays.toString(array));
    }
}

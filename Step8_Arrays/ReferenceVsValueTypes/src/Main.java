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
    }
}

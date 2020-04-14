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

    }
}

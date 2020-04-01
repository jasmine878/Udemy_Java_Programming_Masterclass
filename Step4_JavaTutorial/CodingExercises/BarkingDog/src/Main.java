public class Main {
    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true, 1));                  //expect true
        System.out.println(BarkingDog.shouldWakeUp(false, 2));                 //expect false
        System.out.println(BarkingDog.shouldWakeUp(true, 8));                  //expect false
        System.out.println(BarkingDog.shouldWakeUp(true, -1));                 //expect false
    }
}

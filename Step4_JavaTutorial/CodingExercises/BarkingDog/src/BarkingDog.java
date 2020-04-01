public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));                  //expect true
        System.out.println(shouldWakeUp(false, 2));                 //expect false
        System.out.println(shouldWakeUp(true, 8));                  //expect false
        System.out.println(shouldWakeUp(true, -1));                 //expect false
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true && ((hourOfDay >= 0 && hourOfDay < 8)) || hourOfDay > 22 && hourOfDay <= 23) {
            return true;
        } else {
            return false;
        }
    }
}

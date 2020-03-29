public class Main {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println(myString);

        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";

        System.out.println("Concatenating two strings equals " + numberString);
    }
}

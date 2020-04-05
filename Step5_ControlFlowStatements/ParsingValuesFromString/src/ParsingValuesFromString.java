public class ParsingValuesFromString {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("number as a string: " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        double number2 = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);
        System.out.println("\n");

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString " + numberAsString);
        System.out.println("number " + number);
    }


}

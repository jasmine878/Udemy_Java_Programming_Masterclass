package academy.learnprogramming;

public class FloatAndDouble {
    public static void main(String[] args) {
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + minFloat);
        System.out.println("Float maximum value = " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + minDouble);
        System.out.println("Double maximum value = " + maxDouble);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3f;

        System.out.println("int calculation result: " + myIntValue);
        System.out.println("float calculation result " + myFloatValue);
        System.out.println("double calculation result " + myDoubleValue);
    }
}

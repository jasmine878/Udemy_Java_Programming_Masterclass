public class AreaCalculator {

    public static double area (double radius) {
        if (radius < 0) return -1;

        return radius * radius * Math.PI;
    }

    public static double area (double length, double width) {
        if (length < 0 || width < 0) return -1;

        return length * width;
    }
}

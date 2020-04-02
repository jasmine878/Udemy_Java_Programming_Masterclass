public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));                  //expect 78.53975
        System.out.println(area(-1));                   //expect -1
        System.out.println(area(5.0, 4.0));                          //expect 20.0
        System.out.println(area(-1.0, 4.0));     //expect -1
    }
    public static double area (double radius) {
        if (radius < 0) return -1;

        return radius * radius * Math.PI;
    }

    public static double area (double length, double width) {
        if (length < 0 || width < 0) return -1;

        return length * width;
    }
}

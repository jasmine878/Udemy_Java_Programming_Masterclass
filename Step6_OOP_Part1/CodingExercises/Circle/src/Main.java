public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());         //expect 3.75
        System.out.println("circle.area= " + circle.getArea());             //expect 44.178
        System.out.println();

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());     //expect 5.55
        System.out.println("cylinder.height= " + cylinder.getHeight());     //expect 7.25
        System.out.println("cylinder.area= " + cylinder.getArea());         //expect 96.7689
        System.out.println("cylinder.volume= " + cylinder.getVolume());     //expect 701.5745
    }
}

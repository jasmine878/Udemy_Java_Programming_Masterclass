public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());             //expect 5
        System.out.println("rectangle.length= " + rectangle.getLength());           //expect 10
        System.out.println("rectangle.area= " + rectangle.getArea());               //expect 50
        System.out.println();

        Cuboid cuboid = new Cuboid(5, 10, 5);

        System.out.println("cuboid width= " + cuboid.getWidth());                   //expect 5
        System.out.println("cuboid.length= " + cuboid.getLength());                 //expect 10
        System.out.println("cuboid.area= " + cuboid.getArea());                     //expect 50
        System.out.println("cuboid.height= " + cuboid.getHeight());                 //expect 5
        System.out.println("cuboid.volume= " + cuboid.getVolume());                 //expect 250
    }
}

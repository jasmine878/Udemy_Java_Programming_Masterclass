public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0, 0= " + first.distance());               //7.81012496
        System.out.println("distance(second)= " + first.distance(second));      //5.0
        System.out.println("distance(2, 2)= " + first.distance(2, 2));    //5.0

        Point point = new Point();
        System.out.println("distance()= " + point.distance());                  //0.0
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x - 0, 2) + Math.pow(this.y - 0, 2));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Point point2) {
        return Math.sqrt(Math.pow(this.x - point2.getX(), 2) + Math.pow(this.y - point2.getY(), 2));
    }
}

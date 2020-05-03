public class Dog {
    private final String name;

    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj instanceof Dog) {
            String objName = ((Dog) obj).getName();

            return this.name.equals(objName);
        }

        return false;
    }
}

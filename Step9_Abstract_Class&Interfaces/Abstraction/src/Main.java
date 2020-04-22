public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        System.out.println();

        Bird bird = new Bird("Parrot");
        bird.breathe();
        bird.eat();
    }
}

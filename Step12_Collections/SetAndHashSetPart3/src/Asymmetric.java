import java.util.HashSet;
import java.util.Set;

public class Asymmetric {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add((int) Math.pow(i, 3));
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size());
        System.out.println();

    }
}

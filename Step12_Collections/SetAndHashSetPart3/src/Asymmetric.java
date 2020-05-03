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

        //These bulk operations are destructive which means they modify the set they're called upon
        //this is why we create a 3rd hashSet
        Set<Integer> squaresAndCubes = new HashSet<>(squares);
        squaresAndCubes.addAll(cubes);
        System.out.println("A union of the hashSets results in " + squaresAndCubes.size() + " elements.");

        //our union of the hashSets only prints a size of 196 elements
        //Since we're missing 4 elements, they must be in the intersection
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");;
        System.out.println();

        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }
    }
}

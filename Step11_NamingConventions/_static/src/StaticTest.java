public class StaticTest {
//    private int numInstances = 0;
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        this.numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return this.name;
    }
}

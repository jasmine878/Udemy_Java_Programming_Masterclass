public class StaticTest {
    private int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public int getNumInstances() {
        return this.numInstances;
    }

    public String getName() {
        return this.name;
    }
}

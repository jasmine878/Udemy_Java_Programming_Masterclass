public class SplitMethod {
    public static void main (String[] args) {
        String[] road = "You are standing at the end of a road before a small brick building".split(" ");

        for (String word : road) {
            System.out.println(word);
        }
        System.out.println("===================================");

        String[] building = "You are inside a building, a well house for a small spring".split(", ");
        for (String phrase : building) {
            System.out.println(phrase);
        }
    }
}

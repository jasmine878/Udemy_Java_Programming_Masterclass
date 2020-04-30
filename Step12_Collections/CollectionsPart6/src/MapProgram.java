import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        //we have to use java.util, because we used a reserved word for our Class name
        //and our same name variable is confusing Java
        //so we need to specify the type of Map Class to remove any errors
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about Java");
        System.out.println(languages.get("Java"));
    }
}

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        //we have to use java.util, because we used a reserved word for our Class name
        //and our same name variable is confusing Java
        //so we need to specify the type of Map Class to remove any errors
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "algorithmic language");

        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about Java");
        System.out.println(languages.get("Java"));

        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));
        System.out.println(languages.put("Python", "this is a test"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("===============================");

        //loops through the map and prints all of the keys and values
        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

//        System.out.println("===============================");
//        languages.remove("Lisp");

//        for (String key: languages.keySet()) {
//            System.out.println(key + " : " + languages.get(key));
//        }

        System.out.println("===============================");
        if (languages.remove("Algol", "algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));
        System.out.println(languages.replace("Scala", "this will not be added"));

        if (languages.replace("Lisp", "This will not work", "another definition")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        if (languages.replace("Lisp", "a functional programming language with imperative features", "another definition")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}

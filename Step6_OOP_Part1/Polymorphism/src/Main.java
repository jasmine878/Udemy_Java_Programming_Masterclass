public class Main {
    public static void main(String[] args) {

    }

    public class Movie {
        private String name;

        public Movie(String name) {
            this.name = name;
        }

        public String plot() {
            return "No plot here";
        }
    }

    public class Jaws extends Movie {
        public Jaws() {
            super("Jaws");
        }

        public String plot() {
            return "A shark eats lots of people";
        }
    }
}

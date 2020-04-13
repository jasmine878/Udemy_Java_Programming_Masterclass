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

    public class IndependenceDay extends Movie {
        public IndependenceDay() {
            super("Independence Day");
        }

        @Override
        public String plot() {
            return "Aliens attempt to takeover planet earth";
        }
    }
}

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

    public class MazeRunner extends Movie {
        public MazeRunner() {
            super("Maze Runner");
        }

        @Override
        public String plot() {
            return "Kids try to escape a maze";
        }
    }

    public class StarWars extends Movie {
        public StarWars() {
            super("Star Wars");
        }

        @Override
        public String plot() {
            return "Imperial Forces try to take over the Galaxy";
        }
    }
}

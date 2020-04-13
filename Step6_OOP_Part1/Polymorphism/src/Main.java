class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to takeover planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the Galaxy";
    }
}

class ForgetableMovieType extends Movie {
    public ForgetableMovieType() {
        super("Forgetable");
    }

    //no plot method
}

public class Main {
    public static void main(String[] args) {
        
    }

    //purpose of this method is to return a random Movie
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5 + 1);
        System.out.println("Random number generated is: " + randomNumber);

        switch(randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgetableMovieType();
            default:
                return null;
        }
    }
}
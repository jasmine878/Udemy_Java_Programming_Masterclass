import java.util.ArrayList;

public class Team {
    private String name;
    int gamesPlayed = 0;
    int gamesWon = 0;
    int gamesTied = 0;
    int gamesLost = 0;

    //we're creating an arrayList using generics
    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

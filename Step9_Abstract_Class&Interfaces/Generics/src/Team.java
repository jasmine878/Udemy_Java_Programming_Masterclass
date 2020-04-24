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

    public boolean addPlayer(Player player) {
        if (!members.contains(player)) {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        } else {
            System.out.println(player.getName() + " is already on this team");
            return false;
        }
    }

}

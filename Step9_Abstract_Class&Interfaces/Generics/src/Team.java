import java.util.ArrayList;

public class Team<T> {
    private String name;
    int gamesPlayed = 0;
    int gamesWon = 0;
    int gamesTied = 0;
    int gamesLost = 0;

    //we're creating an arrayList using generics
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean addPlayer(T player) {
        if (!members.contains(player)) {
            members.add(player);
            System.out.println(((Player) player).getName() + " picked for team " + this.name);
            return true;
        } else {
            System.out.println(((Player) player).getName() + " is already on this team");
            return false;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void gameResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) gamesWon++;
        if (ourScore < theirScore) gamesLost--;
        if (ourScore == theirScore) gamesTied++;

        gamesPlayed++;

        if (opponent != null) {
            opponent.gameResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return gamesWon * 2 + gamesTied;
    }
}
